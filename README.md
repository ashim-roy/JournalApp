# Journal App

A backend Journal Management application built with Spring Boot and MongoDB. The application allows users to securely create, manage, and organize personal journal entries.

## Features

* User Registration and Management
* Spring Security Authentication (Basic Auth)
* Password Encryption using BCrypt
* Role-Based Authorization (USER / ADMIN)
* Journal Entry CRUD Operations
* User-Specific Journal Access Control
* MongoDB Atlas Integration
* Spring Data MongoDB Repositories
* DBRef Relationship Mapping between Users and Journal Entries
* Transaction Management with MongoTransactionManager
* RESTful APIs
* Layered Architecture (Controller → Service → Repository)
* Exception Handling and Logging
* Lombok Integration
* JUnit 5 Testing
* Parameterized Tests
* Custom Test Data Providers using `ArgumentsProvider`

## Tech Stack

* Java 21
* Spring Boot
* Spring Security
* Spring Data MongoDB
* MongoDB Atlas
* Maven
* Lombok
* JUnit 5

## Project Structure

```text
src/main/java
├── controller
├── service
├── repository
├── entity
├── config
└── JournalAppApplication

src/test/java
├── service
│   ├── UserServiceTests
│   └── UserArgumentProvider
```

## Learning Concepts Covered

* Dependency Injection (IoC)
* Spring Bean Lifecycle
* REST API Development
* MongoDB CRUD Operations
* MongoDB Relationships using DBRef
* Transactions in MongoDB
* Authentication and Authorization
* Password Hashing with BCrypt
* Custom UserDetailsService
* Repository Pattern
* Exception Handling
* Spring Security Filter Chain
* Basic Authentication
* Role-Based Access Control (RBAC)
* Unit Testing with JUnit 5
* Parameterized Testing
* Custom Argument Sources
* Test Automation using Maven

## Current Status

* ✅ User Authentication
* ✅ Role-Based Authorization
* ✅ Journal CRUD APIs
* ✅ MongoDB Atlas Integration
* ✅ Transaction Management
* ✅ JUnit Testing
* ✅ Parameterized Testing
* 🔄 Mockito-Based Unit Testing (In Progress)
* 🔄 JWT Authentication (Planned)

## Future Enhancements

* JWT Authentication
* Refresh Tokens
* Global Exception Handling
* Swagger / OpenAPI Documentation
* Dockerization
* CI/CD Pipeline using GitHub Actions
* Integration Tests and Mockito
* API Rate Limiting
* Audit Logging

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/ashim-roy/JornalApp.git
cd JornalApp
```

### Configure MongoDB

Update `application.properties` with your MongoDB Atlas connection string.

### Run the Application

```bash
./mvnw spring-boot:run
```

### Run Tests

```bash
./mvnw test
```
