package Assignment5;

public class SoftwareCompany {
	
	  private String name;
	    private String location;
	    private int numberOfEmployees;
	    private String specialization;
		public SoftwareCompany(String name, String location, int numberOfEmployees, String specialization) {
			super();
			this.name = name;
			this.location = location;
			this.numberOfEmployees = numberOfEmployees;
			this.specialization = specialization;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
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
			return "SoftwareCompany [name=" + name + ", location=" + location + ", numberOfEmployees="
					+ numberOfEmployees + ", specialization=" + specialization + "]";
		}
}
