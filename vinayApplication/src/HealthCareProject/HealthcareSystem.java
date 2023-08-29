package HealthCareProject;
import java.util.*;
public class HealthcareSystem {
	
	  private ArrayList<Patient> patients;

	    public HealthcareSystem() {
	        patients = new ArrayList<>();
	    }

	    public void addPatient(Patient patient) {
	        patients.add(patient);
	    }

	    public Patient findPatientById(int id) {
	        for (Patient patient : patients) {
	            if (patient.getId() == id) {
	                return patient;
	            }
	        }
	        return null;
	    }

	    public ArrayList<Patient> findPatientsByCondition(String condition) {
	        ArrayList<Patient> matchingPatients = new ArrayList<>();
	        for (Patient patient : patients) {
	            if (patient.getCondition().equalsIgnoreCase(condition)) {
	                matchingPatients.add(patient);
	            }
	        }
	        return matchingPatients;
	    }

	    public void displayAllPatients() {
	        for (Patient patient : patients) {
	            System.out.println(patient);
	            System.out.println("====================");
	        }
	    }

}
