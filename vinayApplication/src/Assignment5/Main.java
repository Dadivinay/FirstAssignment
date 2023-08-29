package Assignment5;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		 Hospital hospital = new Hospital("City  General Hospital", "New York", 300, 150);
		 
	 SoftwareCompany softwareCompany = new SoftwareCompany("Tech Innovators", "San Francisco", 500, "AI and Machine Learning");

	        System.out.println("Hospital Information:");
	        System.out.println("Name: " + hospital.getName());
	        System.out.println("Location: " + hospital.getLocation());
	        System.out.println("Capacity: " + hospital.getCapacity());
	        System.out.println("Available Beds: " + hospital.getAvailableBeds());
	        
	        
	        System.out.println("\nSoftware Company Information:");
	        System.out.println("Name: " + softwareCompany.getName());
	        System.out.println("Location: " + softwareCompany.getLocation());
	        System.out.println("Number of Employees: " + softwareCompany.getNumberOfEmployees());
	        System.out.println("Specialization: " + softwareCompany.getSpecialization());
	    }

	}



