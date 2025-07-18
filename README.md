# Student-Enrollment-System
A Java-based university enrollment system to manage students, courses, and departments. Demonstrates core OOP concepts like inheritance, abstraction, and composition with classes for students, instructors, and course management through a simple CLI.

## Project Structure

The project is organized into the following Java files:

* `Student.java`: Represents a student with properties for name, email, and roll number.
* `Instructor.java`: Represents an instructor with a name and email.
* `Department.java`: Represents a department with a name.
* `Course.java`: A base class for courses, containing properties for the course name, code, department, and instructor.
* `UndergraduateCourse.java`: A subclass of `Course` for undergraduate courses.
* `GraduateCourse.java`: A subclass of `Course` for graduate courses.
* `DemoDriver.java`: The main driver class to demonstrate the functionality of the system by creating objects and enrolling students.

## How to Run

To run this project, you will need to have the Java Development Kit (JDK) installed.

1.  **Compile the Java files:**
    Open your terminal or command prompt, navigate to the project's root directory, and compile all the `.java` files using the following command:

    ```bash
    javac *.java
    ```

2.  **Run the application:**
    After successful compilation, run the `DemoDriver` class to see the output:

    ```bash
    java DemoDriver
    ```

This will execute the `main` method in `DemoDriver.java`, which sets up the sample data and demonstrates the enrollment process.
