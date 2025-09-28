Employee Management System 

Overview
This is a basic Spring Boot web application for managing employees. The application provides features to add, update, delete, and view employee details through a user-friendly interface and REST APIs.

Features
Add new employee records
Update existing employee information
Delete employee records
View list of all employees and individual employee details
Technologies Used
Java 17
Spring Boot
Spring MVC
Spring Data JPA
Hibernate
MYSQL Database
API Endpoints The backend exposes the following RESTful endpoints for managing employees:

Create Employee POST /api/v1/employees Request body: JSON representing the employee details. Response: Created employee object.
Get All Employees GET /api/v1/employees Response: List of all employees.

Get Employee by ID GET /api/v1/employees/{id} URL parameter: id - Employee ID (Long). Response: Employee object wrapped in a ResponseEntity.

Update Employee PUT /api/v1/employees/{id} URL parameter: id - Employee ID to update. Request body: JSON with updated employee details. Response: Updated employee object wrapped in a ResponseEntity.

Delete Employee DELETE /api/v1/employees/{id} URL parameter: id - Employee ID to delete. Response: JSON map with a boolean indicating deletion success.