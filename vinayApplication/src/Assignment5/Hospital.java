package Assignment5;

public class Hospital {
	
	
	  private String name;
	    private String location;
	    private int capacity;
	    private int availableBeds;
		public Hospital(String name, String location, int capacity, int availableBeds) {
			super();
			this.name = name;
			this.location = location;
			this.capacity = capacity;
			this.availableBeds = availableBeds;
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
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public int getAvailableBeds() {
			return availableBeds;
		}
		public void setAvailableBeds(int availableBeds) {
			this.availableBeds = availableBeds;
		}
		public String getName1() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			return "Hospital [name=" + name + ", location=" + location + ", capacity=" + capacity + ", availableBeds="
					+ availableBeds + "]";
		}
		
	    

}
