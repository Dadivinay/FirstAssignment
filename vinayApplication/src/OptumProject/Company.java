package OptumProject;

public class Company {
	
	  private String companyName;
	  private String workDomain;
	  private ContactInformation contactInfo;

  public Company(String companyName, String workDomain, ContactInformation contactInfo) {
	        this.companyName = companyName;
	        this.workDomain = workDomain;
	        this.contactInfo = contactInfo;
	    }


	    public String getCompanyName() {
			return companyName;
		}


		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}


		public String getWorkDomain() {
			return workDomain;
		}


		public void setWorkDomain(String workDomain) {
			this.workDomain = workDomain;
		}


		public ContactInformation getContactInfo() {
			return contactInfo;
		}


		public void setContactInfo(ContactInformation contactInfo) {
			this.contactInfo = contactInfo;
		}

		@Override
		
	    public String toString() {
   return "Company: " + companyName + "\nDomain: " + workDomain + "\n" + contactInfo;
	    }
		
}
