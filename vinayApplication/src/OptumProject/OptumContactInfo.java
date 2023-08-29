package OptumProject;

public class OptumContactInfo {
	 public static void main(String[] args) {
 ContactInformation optumContact = new ContactInformation("John Doe", "john@optum.com", "123-456-7890");

	   Company optum = new Company("Optum", "Healthcare", optumContact);
	   
       System.out.println("Optum Company Information:");
       
       System.out.println(optum);
       
       
	             }
           }
