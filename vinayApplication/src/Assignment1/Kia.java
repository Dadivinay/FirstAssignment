package Assignment1;

public class Kia extends Vehicle {

	
	 private String color;
	 
     public Vehicle getVehicle() {
    	 
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	private String carname;
     private int    carweight;
     Vehicle vehicle;
     
     
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
    public void printMethod() {
    	System.out.println();
    }
	public void KiaSpeed() {
		 System.out.println("The Speed of kia car is 150km/hr");
		
	}
	public void KiaWeight() {
		System.out.println("The weight of the kia car is 1000kgs ");
	}
    public void KiaAvailable() {
	System.out.println("The availability kia cars are: 10");
   }
	
    }

