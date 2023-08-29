package HealthCareProject;
import java.util.*;
public class HealthcareApp {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        HealthcareSystem system = new HealthcareSystem();

	        while (true) {
	            System.out.println("1. Add Patient\n2. Find Patient by ID\n3. Find Patients by Condition\n4. Display All Patients\n5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            if (choice == 1) {
	                System.out.print("Enter patient ID: ");
	                int id = scanner.nextInt();
	                System.out.print("Enter patient name: ");
	                String name = scanner.next();
	                System.out.print("Enter patient age: ");
	                int age = scanner.nextInt();
	                System.out.print("Enter patient condition: ");
	                String condition = scanner.next();
	                Patient patient = new Patient(id, name, age, condition);
	                system.addPatient(patient);
	                System.out.println("Patient added successfully!");
	            } else if (choice == 2) {
	                System.out.print("Enter patient ID: ");
	                int id = scanner.nextInt();
	                Patient patient = system.findPatientById(id);
	                if (patient != null) {
	                    System.out.println("Patient found:");
	                    System.out.println(patient);
	                } else {
	                    System.out.println("Patient not found.");
	                }
	            } else if (choice == 3) {
	                System.out.print("Enter patient condition: ");
	                String condition = scanner.next();
	                ArrayList<Patient> matchingPatients = system.findPatientsByCondition(condition);
	                if (!matchingPatients.isEmpty()) {
	                    System.out.println("Patients with condition '" + condition + "':");
	                    for (Patient patient : matchingPatients) {
	                        System.out.println(patient);
	                        System.out.println("====================");
	                    }
	                } else {
	                    System.out.println("No patients found with condition '" + condition + "'.");
	                }
	            } else if (choice == 4) {
	                System.out.println("All patients:");
	                system.displayAllPatients();
	            } else if (choice == 5) {
	                System.out.println("Exiting the program.");
	                break;
	            } else {
	                System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }

	        scanner.close();

	}

}
