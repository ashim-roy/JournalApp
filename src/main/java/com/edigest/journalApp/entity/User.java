package com.edigest.journalApp.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document(collection = "users")
@Builder
public class User {

    @Id
    private ObjectId id; // we could tae it spring an dspring data mongodb wll do conversion
    @Indexed(unique = true) // with indexing our searching on userName filed will be fast and with unique=true all will be unique
    @NonNull
    private String userName; // we want it to bbe unique
    @NonNull
    private String password;
    @DBRef
    private List<JournalEntry> journalEntries = new ArrayList<>();
    private List<String>  roles;
}
