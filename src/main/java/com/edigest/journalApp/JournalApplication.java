package com.edigest.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class JournalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JournalApplication.class, args);
		//System.out.println(context.getEnvironment());
		ConfigurableEnvironment environment = context.getEnvironment();
		System.out.println(environment.getActiveProfiles()[0]);

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