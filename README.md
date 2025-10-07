# Student Management System (JDBC)

A simple Java console application to manage student records using JDBC and MySQL. This project demonstrates CRUD operations (Create, Read, Update, Delete) on a `students` table in a MySQL database.

## Features

- Add a new student
- View all students
- Update a student's course
- Delete a student by ID
- Simple command-line interface

## Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL

## Project Structure

- `Student`: POJO class representing a student
- `StudentDAO`: Interface defining CRUD methods
- `StudentDAOImpl`: Implementation of DAO interface using JDBC
- `StudentManagementApplication`: Main class with the application loop and user interface

## Database Setup

1. Install and run MySQL.
2. Create a database named `studentdb` and a table named `students`:
    ```sql
    CREATE DATABASE studentdb;
    USE studentdb;
    CREATE TABLE students (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(100),
        age INT,
        course VARCHAR(100)
    );
    ```

3. Update the database connection credentials in `StudentDAOImpl.java` if needed:
    ```java
    private static String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static String USER = "root";
    private static String PASSWORD = "Sujith@123";
    ```

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/SaiSujith07/Student_Management_JDBC.git
    cd Student_Management_JDBC
    ```

2. Compile the Java files (make sure you have the MySQL JDBC driver in your classpath):
    ```bash
    javac -cp .:mysql-connector-java-8.0.xx.jar com/student_management/*.java
    ```

3. Run the application:
    ```bash
    java -cp .:mysql-connector-java-8.0.xx.jar com.student_management.StudentManagementApplication
    ```

4. Follow the on-screen menu to add, view, update, or delete students.

## Example

```
--- Student Record Management ---
1. Add Student
2. View All Students
3. Update Student Course
4. Delete Student
5. Exit
Enter your choice: 1
Enter name: John Doe
Enter age: 20
Enter course: Computer Science
Student added!
```

## Notes

- Ensure the MySQL server is running and accessible from your application.
- Update database credentials if they are different on your system.
- The project does not use any frameworks (like Spring), focusing on plain JDBC for educational purposes.

## License

This project is open source and available under the [MIT License](LICENSE).
