package com.edigest.journalApp.service;

import com.edigest.journalApp.entity.JournalEntry;
import com.edigest.journalApp.entity.User;
import com.edigest.journalApp.repository.JournalEntryRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
@Slf4j // log.error a log resolves form this annotation
public class JournalEntryService {
    // code and business logic which will make entry to DB
    @Autowired
    private JournalEntryRepository journalEntryRepository;
    @Autowired
    private UserService userService;

    // JournalEntryService depends on JournalEntryRepository to perform database operations. Instead of creating the repository object manually using:
    //JournalEntryRepository repo = new JournalEntryRepository();   //we let Spring create and manage the object.
    //Using @Autowired, we tell Spring:   //	"Inject the required JournalEntryRepository bean here."
    //At runtime, Spring finds the implementation of JournalEntryRepository, creates the bean, and injects it into JournalEntryService.
    //This is called Dependency Injection (DI) and is a core concept of Inversion of Control (IoC).
    /*
    public JournalEntry save(JournalEntry journalEntry) {
        return journalEntryRepository.save(journalEntry);
    }
    */

    @Transactional
    public void saveEntry(JournalEntry journalEntry, String userName) {
        try {
            User user = userService.findByUsername(userName);
            journalEntry.setDate(LocalDateTime.now());
            JournalEntry saved = journalEntryRepository.save(journalEntry);
            user.getJournalEntries().add(saved);
            userService.saveUser(user);
        }catch (Exception e) {
            log.error("Error saving journal entry", e);
            throw new RuntimeException("An error occured while saving the entry.", e);
            }
    }
// overloaded method of save Entry
    public void saveEntry(JournalEntry journalEntry ) {
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAllEntries() {
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> getEntryById(ObjectId id) {
        return journalEntryRepository.findById(id);  // Mongo doesn't find record:  Optional.empty()
    }

    @Transactional
    public boolean deleteById(ObjectId id, String userName) {
        boolean removed = false;
        try {
            User user = userService.findByUsername(userName);
            removed = user.getJournalEntries().removeIf(x -> x.getId().equals(id));
            if (removed) {
                userService.saveUser(user);
                journalEntryRepository.deleteById(id);
            }
        }catch (Exception e) {
           // log.error("Error deleting journal entry", e);
            System.out.println(e.getMessage());
            throw new RuntimeException("An error occured while deleting the entry.", e);
        }
        return removed;
    }

   /* public List<JournalEntry> findByUserName(String userName) { // its there in user service

    }*/

}
