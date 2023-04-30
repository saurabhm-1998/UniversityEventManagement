# User_Management_System_With_Validation_Springboot

This is a User Management System built with Java and Spring Boot. The project uses ArrayList as a database for storing user information. The application provides functionality to create, read, update and delete users.

## Frameworks and Language Used

* Java 11 
* Spring Boot
* Spring Web
* Spring Validation
* SpringBoot Web Tools
* H2 in memory database
* Maven

## Data Flow

The data flow in this system is divided into four main layers: Controller, Service, Repository and Database.

### Controller

The Controller layer handles incoming HTTP requests and responses. It receives the request from the client, validates the input, calls the appropriate service methods, and returns the response to the client.

### Service

The Service layer is responsible for implementing the business logic of the application. It receives the data from the Controller layer, processes it, and interacts with the Repository layer to retrieve or store data.

### Repository
The Repository layer manages the data storage and retrieval. In this application, an in memory H2 database is used to store and manage user data.

### Database Design
This project uses an in-memory data storage approach, using H2 database in Java to store user data.

## Data Structured Used
This project uses the following data structures:

Entity: Student

firstName (String)

lastName (String)

age (Integer)

department (Enum)

events (Many-to-Many Relationship with Event Entity)

Entity: Event

eventName (String)

locationOfEvent (String)

date (Date)

startTime (Time)

endTime (Time)

students (Many-to-Many Relationship with Student Entity)

## Project Summary

This project is a basic student and event management system that allows users to add, retrieve, update, and delete student and event data. It uses RESTful web services to handle HTTP requests and responses, and Spring Boot to provide a simple, easy-to-use framework for building the application. Data is stored and managed using the H2 in-memory database, which makes it easy to develop and test the application locally without the need for a separate database server.
