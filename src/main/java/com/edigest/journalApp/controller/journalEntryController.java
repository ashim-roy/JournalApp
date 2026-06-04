
/*
package com.edigest.journalApp.controller;

import com.edigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class journalEntryController {

    private Map<Long, JournalEntry> journalEntryMap =  new HashMap<>();

    @GetMapping("/abc")
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntryMap.values());    // http://localhost:8080/journal/abc
    }

    @PostMapping
    public boolean createJournalEntry(@RequestBody JournalEntry myEntry) {
        journalEntryMap.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("/id/{myid}")                   //  GET /journal/id/1
    public JournalEntry getJournalEntryId(@PathVariable long myid) {
        return journalEntryMap.get(myid);
    }

    @GetMapping
    public JournalEntry getById(@RequestParam long myid) {    //GET http://localhost:8080/journal?myid=1
        return journalEntryMap.get(myid);
    }

    @PutMapping("id/{id}")
    public JournalEntry getById(@PathVariable long id, @RequestBody JournalEntry myEntry) {
        return journalEntryMap.put(id, myEntry);
    }


    @DeleteMapping("id/{myid}")
    public boolean deleteJournalEntry(@PathVariable long myid) {
        return journalEntryMap.remove(myid) != null;
    }

}
 */

