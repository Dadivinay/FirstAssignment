package MiniProjectt;
 import java.util.*;
public class StudentManagementApp {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
            System.out.println("1. Add Student\n2. Find Student by ID\n3. Display All Students\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter student name: ");
                String name = scanner.next();
                System.out.print("Enter student grade: ");
                double grade = scanner.nextDouble();
                Student student = new Student(id, name, grade);
                system.addStudent(student);
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                Student student = system.findStudentById(id);
                if (student != null) {
                    System.out.println("Student found:");
                    System.out.println(student);
                } else {
                    System.out.println("Student not found.");
                }
            } else if (choice == 3) {
                System.out.println("All students:");
                system.displayAllStudents();
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }

}
