package com.student_management;

import java.util.List;
import java.util.Scanner;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAOImpl();

        while (true) {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Course");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter course: ");
                    String course = sc.nextLine();

                    Student s = new Student(name, age, course);
                    System.out.println(dao.addStudent(s) ? "Student added!" : "Failed to add student.");
                    break;

                case 2:
                    List<Student> students = dao.getAllStudents();
                    System.out.println("\n--- Student List ---");
                    students.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter student ID to update: ");
                    int idToUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new course: ");
                    String newCourse = sc.nextLine();
                    System.out.println(dao.updateStudent(idToUpdate, newCourse) ? "Updated!" : "Not found.");
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int idToDelete = sc.nextInt();
                    System.out.println(dao.deleteStudent(idToDelete) ? "Deleted!" : "Not found.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
	}

}
