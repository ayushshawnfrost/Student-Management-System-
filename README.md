# Student Management System

A simple **CRUD** application built with **Spring Boot 3** (Java 17) and **React**, using a **PostgreSQL** database. This application allows you to:

- Create a new student record  
- View all students  
- Search for students by name  
- Update an existing student record  
- Delete a student record  

## Features

- **Add New Student**: Name, Age, Class, Phone Number  
- **View All Students**: Displays a table of all students  
- **Search Students**: Filters students by name  
- **Edit Student**: Update an existing student’s details  
- **Delete Student**: Remove a student by ID  

---

## Screenshots

![image](https://github.com/user-attachments/assets/77b9bd93-1563-46dd-8d96-0ac7c240e29e)


![image](https://github.com/user-attachments/assets/85a0b563-11fa-4315-b54d-f81c169f293b)


![image](https://github.com/user-attachments/assets/8983db28-9c3e-4323-9de0-b1f6b0f8a038)

![image](https://github.com/user-attachments/assets/a0683107-473b-4f91-82b6-a5c038d557c8)


---
## Tech Stack

- **Backend**: Spring Boot 3 (Java 17), Hibernate/JPA  
- **Database**: PostgreSQL (running locally)  
- **Frontend**: React (Create React App or similar)  
- **Documentation**: Springdoc OpenAPI (Swagger UI)  

---

## Prerequisites

- **Java 17** installed  
- **Node.js** (v16+ recommended)  
- **PostgreSQL** installed and running locally  
- **Maven** (if you’re using Maven to build) or **Gradle** (if using Gradle)  

---

## Database Setup

1. **Install PostgreSQL** if you haven’t already. On Windows, you can download the installer from [postgresql.org](https://www.postgresql.org/download/).  
2. **Create a database** for the application. Example:

   ```sql
   CREATE DATABASE std_mgmt_prod;
   ```

---

## API Usage

In your **Spring Boot** application, you might have endpoints like:

- **GET** `/api/students` – Retrieve all students  
- **GET** `/api/students/{id}` – Get a specific student  
- **GET** `/api/students?name={searchName}` – Search by name  
- **POST** `/api/students` – Create a new student  
- **PUT** `/api/students/{id}` – Update an existing student  
- **DELETE** `/api/students/{id}` – Delete a student  

These endpoints can be tested via **Swagger UI** or **Postman**.

---

## Running the Application

1. **Start PostgreSQL** on your machine.
2. **Run Spring Boot**:
   - Navigate to the backend project folder
   - `mvn spring-boot:run` (or `gradle bootRun`)
   - Verify logs for no errors
3. **Start React** in a separate terminal:
   - `cd student-management-frontend`
   - `npm start`
4. **Access** your React UI at [http://localhost:3000](http://localhost:3000).
5. **Swagger** docs at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

---
