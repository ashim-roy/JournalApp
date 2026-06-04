package com.edigest.journalApp.repository;

import com.edigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {  // takes pojo and type
        // Best PRACTICE
      // controller calls --> Service --> serice is empty so service calls --> reporsitory which in IF and empty


}
