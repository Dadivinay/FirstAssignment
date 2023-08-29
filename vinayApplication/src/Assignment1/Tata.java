package Assignment1;

public class Tata extends Vehicle{
	
         private String color;
         private String carname;
         private int    carweight;
          Vehicle vehicle;
		public Vehicle getVehicle() {
			return vehicle;
		}
		public void setVehicle(Vehicle vehicle) {
			this.vehicle = vehicle;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getCarname() {
			return carname;
		}
		public void setCarname(String carname) {
			this.carname = carname;
		}
		public int getCarweight() {
			return carweight;
		}
		public void setCarweight(int carweight) {
			this.carweight = carweight;
		}
         
         public void TataSpeed() {
        	 System.out.println("The speed of the tata car is 150km/hr ");
         }
         public void TataWeight() {
        	 System.out.println("The weight of the tata car is 125kgs ");
         }
         public void TataAvailable() {
        		System.out.println("The availability tata cars are: 15");
        	   }
         
         
         
	}
