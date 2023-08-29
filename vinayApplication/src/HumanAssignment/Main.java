package HumanAssignment;

public class Main {
	
	public static void main(String[] args) {
		
        Ias iasOfficer = new Ias("Vinay");
        Ips ipsOfficer = new Ips("Vishnu");
        Doctor doctor = new Doctor("Akshya");
        Lawyer lawyer = new Lawyer("Akshaj");

        iasOfficer.walking();
        iasOfficer.work();
        iasOfficer.sleeping();

        ipsOfficer.eating();
        ipsOfficer.enforceLaw();

        doctor.heal();
        doctor.sleeping();
        doctor.walking();

        lawyer.walking();
        lawyer.advocate();
         
	}

}
