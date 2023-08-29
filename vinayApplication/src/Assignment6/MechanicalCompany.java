package Assignment6;

public class MechanicalCompany {
	 private String name;
	    private ContactInfo contactInfo;
	    private int numberOfEmployees;
	    private String specialization;

	    public MechanicalCompany(String name, ContactInfo contactInfo, int numberOfEmployees, String specialization) {
	        this.name = name;
	        this.contactInfo = contactInfo;
	        this.numberOfEmployees = numberOfEmployees;
	        this.specialization = specialization;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ContactInfo getContactInfo() {
			return contactInfo;
		}

		public void setContactInfo(ContactInfo contactInfo) {
			this.contactInfo = contactInfo;
		}

		public int getNumberOfEmployees() {
			return numberOfEmployees;
		}

		public void setNumberOfEmployees(int numberOfEmployees) {
			this.numberOfEmployees = numberOfEmployees;
		}

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		@Override
		public String toString() {
			return "MechanicalCompany [name=" + name + ", contactInfo=" + contactInfo + ", numberOfEmployees="
					+ numberOfEmployees + ", specialization=" + specialization + "]";
		}
	    
	
	
}
