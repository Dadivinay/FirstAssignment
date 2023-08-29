package OptumProject;

public class ContactInformation {
	
	 private String name;
	    private String email;
	    private String phoneNumber;

	    public ContactInformation(String name, String email, String phoneNumber) {
	        this.name = name;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }

	    public String getName() {
	        return name;
	    }
	    public String getEmail() {
	        return email;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }
	    @Override
	    public String toString() {
	        return "Name: " + name + "\nEmail: " + email + "\nPhone: " + phoneNumber;
	    }

}
