# User Service - Microservice using Spring Boot

This is a microservice project to manage user registration and retrieval using Spring Boot, Java 11, and Oracle DB.

## Features

- REST API to register and retrieve users
- Validates input with age > 18 and only for users in France
- Logs all requests with processing time using AOP
- Includes unit tests with JUnit and Mockito
- Clean layered architecture with service, controller, repository

## Technologies

- Java 11
- Spring Boot
- Spring Data JPA
- Maven
- JUnit 5, Mockito
- AOP (Aspect-Oriented Programming)

## Endpoints
### 1. Register a User

**Request Body (JSON)**
{
  "firstName": "John",
  "lastName": "Doe",
  "age": 25,
  "country": "France",
  "email": "john@example.com",
  "phone": "1234567890"
}

Validation:
Age must be greater than 18
Country must be France

### 2. Get User by ID

GET /api/users/{id}?view=minimal
where:
id is a path variable.
view is an optional request parameter with default value minimal.
