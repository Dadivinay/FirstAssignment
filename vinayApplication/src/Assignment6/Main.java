package Assignment6;

public class Main {

	public static void main(String[] args) {
        ContactInfo contactInfo1 = new ContactInfo("123 Main St, Chicago", "+1 555-1234", "info@precisionmechanics.com");
        ContactInfo contactInfo2 = new ContactInfo("456 Industrial Ave, Detroit", "+1 555-5678", "info@industrialMachineries.com");
        ContactInfo contactInfo3 = new ContactInfo("789 PipesIndustry eve, Destroit", "+1 666-91011", "pipes@IndustrialManufacturing.com");

        MechanicalCompany company1 = new MechanicalCompany("Precision Mechanics", contactInfo1, 150, "Automotive Components");
        MechanicalCompany company2 = new MechanicalCompany("Industrial Machineries Ltd.", contactInfo2, 250, "Heavy Machinery");
        MechanicalCompany company3 = new MechanicalCompany("Pipes Manufacturing Comany Ltd.", contactInfo2, 350, "Heavy ManufaturingFactories");

        System.out.println("Mechanical Company 1 Information:");
        System.out.println("Name: " + company1.getName());
        System.out.println("Contact Info: " + company1.getContactInfo().getAddress() +
                           ", Phone: " + company1.getContactInfo().getPhoneNumber() +
                           ", Email: " + company1.getContactInfo().getEmail());
        System.out.println("Number of Employees: " + company1.getNumberOfEmployees());
        System.out.println("Specialization: " + company1.getSpecialization());

        System.out.println("\nMechanical Company 2 Information:");
        System.out.println("Name: " + company2.getName());
        System.out.println("Contact Info: " + company2.getContactInfo().getAddress() +
                           ", Phone: " + company2.getContactInfo().getPhoneNumber() +
                           ", Email: " + company2.getContactInfo().getEmail());
        System.out.println("Number of Employees: " + company2.getNumberOfEmployees());
        System.out.println("Specialization: " + company2.getSpecialization());
        
        System.out.println("\nMechanical Company 3 Information:");
        System.out.println("Name: " + company3.getName());
        System.out.println("Contact Info: " + company3.getContactInfo().getAddress() +
                           ", Phone: " + company3.getContactInfo().getPhoneNumber() +
                           ", Email: " + company3.getContactInfo().getEmail());
        System.out.println("Number of Employees: " + company3.getNumberOfEmployees());
        System.out.println("Specialization: " + company3.getSpecialization());
    }

	}


