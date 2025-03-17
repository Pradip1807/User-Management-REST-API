# User Management REST API

This is a simple RESTful API for managing users. It provides basic CRUD (Create, Read, Update, Delete) operations for user data. The API is built using Spring Boot, Java, and MySQL.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [API Endpoints](#api-endpoints)
- [Sample Requests/Responses](#sample-requests/responses)

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
2. **MySQL**: Install MySQL and create a database named user_management.
3. **Maven**: For building and managing the project.
4. **Postman** or any API testing tool.

### Steps to Run the Project

#### 1. Clone the Repository:

```bash
git clone https://github.com/your-username/user-management-api.git
cd user-management-api
```

