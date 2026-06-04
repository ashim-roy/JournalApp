package com.edigest.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class JournalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JournalAppApplication.class, args);
	}
}
	// Whenever someone asks for PlatformTransactionManager, use this MongoTransactionManager bean.
/*	@Bean
	public PlatformTransactionManager add(MongoDatabaseFactory dbFactory) {
		return new MongoTransactionManager(dbFactory);
	}
}*/

//PlatformTransactionManager
// MongoTransactionManager
// PlatformTransactionManager is Spring's transaction management interface. For MongoDB, we provide its implementation,
// MongoTransactionManager, as a Spring bean. MongoDatabaseFactory is used to create database sessions/connections
// required for transaction management. When Spring encounters @Transactional, it uses this transaction manager to begin, commit, or rollback transactions.