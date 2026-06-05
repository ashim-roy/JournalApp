# Journal App

A backend Journal Management application built with Spring Boot and MongoDB. The application allows users to securely create, manage, and organize personal journal entries.

## Features

- User Registration and Management
- Spring Security Authentication (Basic Auth)
- Password Encryption using BCrypt
- Role-Based Authorization (USER / ADMIN)
- Journal Entry CRUD Operations
- User-Specific Journal Access Control
- MongoDB Atlas Integration
- Spring Data MongoDB Repositories
- DBRef Relationship Mapping between Users and Journal Entries
- Transaction Management with MongoTransactionManager
- RESTful APIs
- Layered Architecture (Controller → Service → Repository)
- Exception Handling and Logging
- Lombok Integration

## Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data MongoDB
- MongoDB Atlas
- Maven
- Lombok

## Project Structure

```text
src/main/java
├── controller
├── service
├── repository
├── entity
├── config
└── JournalAppApplication
```

## Learning Concepts Covered

- Dependency Injection (IoC)
- Spring Bean Lifecycle
- REST API Development
- MongoDB CRUD Operations
- MongoDB Relationships using DBRef
- Transactions in MongoDB
- Authentication and Authorization
- Password Hashing with BCrypt
- Custom UserDetailsService
- Repository Pattern
- Exception Handling
