# Library-Management-System-React-Springboot-
The Library Management System is a full-stack web application designed to simplify the process of managing books in a library. 

Project Description:

The Library Management System is a full-stack web application designed to simplify the process of managing books in a library. It allows users to perform basic CRUD operations—adding new books, viewing available books, and deleting existing ones—through a clean and responsive interface built with React (Vite) on the frontend and Spring Boot on the backend.

The backend provides RESTful APIs for managing the book database using Spring Data JPA with MySQL as the data store. The frontend communicates with the backend through Axios and displays real-time data updates without page reloads. The system ensures seamless integration between client and server using CORS configuration and follows a modular architecture for easy scalability and maintenance.

Key Features:

Add Book: Users can enter details such as book title, author, category, publisher, ISBN, and available copies.

View Books: Displays all books stored in the system in a clean and organized table.

Delete Book: Allows removal of books that are no longer available in the library.

Responsive UI: Built with React and styled for clarity and user-friendliness.

Backend Integration: Uses REST APIs developed in Spring Boot with proper CORS handling.

Database Storage: Book details are persisted in a MySQL database using JPA and Hibernate ORM.

Technologies Used:

Frontend: React (Vite), Axios, HTML, CSS, JavaScript

Backend: Spring Boot, Spring Data JPA, Hibernate

Database: MySQL

Tools & Environment: IntelliJ IDEA / VS Code, Postman, Node.js, Maven

Modules:

Book Entity: Represents book details stored in the database.

Repository Layer: Handles database operations through JPA.

Service Layer: Contains business logic for book management.

Controller Layer: Exposes RESTful APIs for frontend interaction.

React Components: UI components such as Home, AddBook, BookList, and Navbar for easy navigation.

Workflow:

The user opens the frontend interface and navigates through the menu.

When a new book is added, the data is sent to the backend via an Axios POST request.

The backend saves the book details into the MySQL database.

The user can view or delete books using GET and DELETE API calls respectively.

Project Outcome:

This project demonstrates a practical implementation of full-stack development using modern web technologies. It provides hands-on experience in API integration, CRUD operations, database management, and frontend-backend synchronization. The system is scalable and can be extended further to include features like book issue tracking, user authentication, or search functionality
