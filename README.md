# GKBLABS

### Project Name

Welcome to the User Management System

### Overview

This project is a user management system designed to allow users to input their details through a form on the index page. The system validates the entered data, ensuring the age and email format are correct and all details are entered or not. If the data is valid, it gets stored in a MySQL database. Users can then retrieve all user details stored in the database in tabular form.

### Features

- **User Details Form**: The index page contains a form where users can input their details.
- **Validation**: The system validates the entered data, checking for correct age and email format and all details are entered or not.
- **Database Storage**: Valid user details are stored in a MySQL database by clikcing on "submit" button.
- **Data Retrieval**: Users can retrieve all stored user details by clicking the "Retrieve Details" button.
- **Error Handling**: If validation fails, users are alerted with message to enter correct details. If a user already exists in the database, they are redirected to a "User Exist" page informing them.
- **Spring Boot Framework**: The project is built using the Spring Boot framework, providing robustness and ease of development.
- **Java Language**: The backend logic is implemented in Java.
- **Integrated Development Environment (IDE)**: Developed using Spring Suite Tool for efficient development.

### Technologies Used

- **Java**: Backend logic and business rules.
- **Spring Boot**: Framework for building the application.
- **MySQL**: Database for storing user details.
- **HTML/CSS/JavaScript**: Frontend user interface.
- **Spring Suite Tool**: Integrated Development Environment (IDE) used for development.

### Getting Started

To get started with the project:
1. Ensure you have Java JDK, Spring Boot, and MySQL installed on your system.
2. Clone the repository to your local machine.
3. Set up the MySQL database and configure the application properties accordingly.
4. Run the application using Spring Suite Tool or through the command line.
5. Access the application through your web browser.

### Application Workflow

1. **Index Page (Landing Page)**:
   - User lands on the index page.
   - A form is displayed, prompting the user to enter their details.
   - All fields are mandatory, including name, email, and age.
   - Email must end with a valid "@gmail.com" domain.
   - Age must be a positive integer.
   - Upon entering details, the user clicks the "Submit" button.

2. **Validation**:
   - The system validates the entered data.
   - If any fields are missing or the email format or age is incorrect, an error message is displayed, prompting the user to correct their details.
   - If the data is valid, the system checks if the user already exists in the database.

3. **User Existence Check**:
   - If the user exists in the database, the user is redirected to the "UserExist" page.
   - On the "UserExist" page, the user is informed that their data already exists.
   - A button is provided to re-enter new details.
   - Upon clicking the button, the user is redirected back to the index page to enter new details.

4. **User Details Storage**:
   - If the user does not exist in the database, the system stores the user's details successfully.
   - The user is redirected to the "UserDetails" page.
   - On the "UserDetails" page, the user is informed that their data has been stored successfully.
   - The user can view all their details on this page.

5. **Retrieval of User Details**:
   - The user can retrieve all stored user details by clicking the "Retrieve" button.
   - Clicking the "Retrieve" button redirects the user to a page displaying all user details in tabular form.

### Conclusion

This application provides a seamless user experience for entering and managing user details. It ensures data integrity by validating user inputs and prevents duplicate entries in the database. Users are guided through the process with clear instructions and error handling.