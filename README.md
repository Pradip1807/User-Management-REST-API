# User Management REST API

This is a simple RESTful API for managing users. It provides basic CRUD (Create, Read, Update, Delete) operations for user data. The API is built using Spring Boot, Java, and MySQL.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [API Endpoints](#api-endpoints)
- [Sample Requests/Responses](#sample-requests/responses)
- [Technologies Used](#technologies-used)
- [Error Handling](#error-handling)

## Overview

The User Management REST API allows you to perform CRUD operations on user data. It is built using Spring Boot, a popular Java framework for building web applications, and uses MySQL as the database for storing user information. The API is designed to be lightweight, easy to set up, and ideal for learning or small projects.

---

## Features

- **Create a User**: Add a new user with name, email, and age.
- **Retrieve All Users**: Fetch a list of all users.
- **Retrieve a Single User**: Fetch a user by their unique ID.
- **Update a User**: Modify user details using their ID.
- **Delete a User**: Remove a user from the database using their ID.
- **Error Handling**: Proper error messages for invalid input or non-existent users.
- **JSON Responses**: All API responses are in JSON format.
- **Database Integration**: Uses MySQL for persistent storage of user data.

---

## Project Structure

The project is organized into the following key components:

1. src/main/java/com/example/zylentrix/:
- controller/UserController.java
- entity/User.java
- repository/UserRepository.java
- service/UserService.java
- UserManagementApplication.java:

2. src/main/resources/:

- application.properties

3. src/test/:
4. pom.xml:
5. .gitignore:
6. README.md:

---

## Setup Instructions

### Prerequisites

1. **Java Development Kit (JDK)**: JDK 17 or later.
2. **MySQL**: Install MySQL and create a database named user_management_db.
3. **Maven**: For building and managing the project.
4. **Postman** or any API testing tool.

### Steps to Run the Project

#### 1. Clone the Repository:

```bash
git clone https://github.com/Pradip1807/User-Management-REST-API
```

#### 2. Set Up MySQL Database:

##### Open MySQL and create a database:

```sql
CREATE DATABASE user_management_db;
```

### 3. Configure Database Connection:

#### Open the src/main/resources/application.properties file and update the following properties with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/user_management_db
spring.datasource.username=root
spring.datasource.password=India@123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the Application:

#### Using IntelliJ IDEA:

- Open the project in IntelliJ IDEA.

- Right-click on the UserManagementApplication class and select Run.


#### Using Maven:

```bash
mvn spring-boot:run
```

### 5. Access the API:

- The API will be available at http://localhost:8080.

---

## API Endpoints

### 1. Create a User

- **Method**: POST

- **URL**: /api/users

- **Request Body**:
```json
{
  "name": "Pradip Kumar",
  "email": "pradip@gmail.com",
  "age": 23
}
```

- **Response**:
```json
{
  "id": 1,
  "name": "Pradip Kumar",
  "email": "pradip@gmail.com",
  "age": 23
}
```

### 2. Retrieve All Users
- **Method**: GET

- **URL**: /api/users

- **Response**:

  ```json
  [
  {
    "id": 1,
    "name": "Pradip Kumar",
    "email": "pradip@gmail.com",
    "age": 23
  },
  {
    "id": 2,
    "name": "Bikky Raja",
    "email": "bikky@gmail.com",
    "age": 24
  }
  ]
  ```

### 3. Retrieve a Single User

- **Method**: GET
- **URL**: /api/users/1
- **Response**:

  ```json
  {
    "id": 1,
    "name": "Pradip Kumar",
    "email": "pradip@gmail.com",
    "age": 23
  }

  ```

### 4. Update a User
- **Method**: PUT

- **URL**: /api/users/1

- **Request Body**:

```json
{
  "name": "Kumar Pradip",
  "email": "kumar@gmail.com",
  "age": 24
}
```
- **Response**:

```json
{
  "id": 1
  "name": "Kumar Pradip",
  "email": "kumar@gmail.com",
  "age": 24
}
```

### 5. Delete a User
- **Method**: DELETE

- **URL**: /api/users/1

- **Response**: 204 No Content

---

## Sample Requests/Responses

### Create a User
- **Request**:
```json
{
  "name": "Pradip Kumar",
  "email": "pradip@gmail.com",
  "age": 23
}
```

- **Response**:
```json
{
  "id": 1,
  "name": "Pradip Kumar",
  "email": "pradip@gmail.com",
  "age": 23
}
```

### Retrieve All Users
- **Response**:
  ```json
  [
  {
    "id": 1,
    "name": "Pradip Kumar",
    "email": "pradip@gmail.com",
    "age": 23
  },
  {
    "id": 2,
    "name": "Bikky Raja",
    "email": "bikky@gmail.com",
    "age": 24
  }
  ]
  ```
### Retrieve a Single User
- **Response**:
 ```json
  {
    "id": 1,
    "name": "Pradip Kumar",
    "email": "pradip@gmail.com",
    "age": 23
  }

  ```

### Update a User
- **Request**:
```json
{
  "name": "Kumar Pradip",
  "email": "kumar@gmail.com",
  "age": 24
}
```
- **Response**:

```json
{
  "id": 1
  "name": "Kumar Pradip",
  "email": "kumar@gmail.com",
  "age": 24
}
```

### Delete a User
- **Response**: 204 No Content

---

## Technologies Used
- **Backend Framework**: Java, Spring Boot

- **Database**: MySQL

- **Build Tool**: Maven

- **API Testing**: Postman

---

## Error Handling
### The API handles the following errors:

- **400 Bad Request**: Invalid input data (e.g., missing fields).

- **404 Not Found**: User not found.

- **500 Internal Server Error**: Server-side errors.

---

## Contact and Support
For any issues or queries, please contact: Email: kumarpradip1807@gmail.com

---

This README.md file provides a complete guide to understanding, setting up, and using the User Management REST API. 
