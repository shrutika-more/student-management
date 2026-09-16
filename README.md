# Student Management API 🎓

A RESTful Student Management API developed using Java and Spring Boot.  
The application performs CRUD operations on student data using MySQL.

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- REST API
- Maven
- Postman

## ✨ Features

- Add a new student
- Get all students
- Get a student by ID
- Update student details
- Delete a student
- Store student data in MySQL database

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| POST | `/students` | Add a student |
| PUT | `/students/{id}` | Update a student |
| DELETE | `/students/{id}` | Delete a student |

## 🗄️ Database

Database: `studentdbb`

MySQL is used as the database and Spring Data JPA/Hibernate is used for database interaction.

## 🏗️ Project Structure

- **Entity** – Student data model
- **Repository** – Database operations
- **Service** – Business logic
- **Controller** – REST API endpoints

## 🚀 How to Run

1. Clone the repository.
2. Open the project in VS Code or IntelliJ IDEA.
3. Configure MySQL in `application.properties`.
4. Start the Spring Boot application.
5. Test the APIs using Postman.

## 📌 Project Type

Java Backend Project – Student Management REST API