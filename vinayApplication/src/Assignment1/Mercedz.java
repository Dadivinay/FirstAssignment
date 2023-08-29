package Assignment1;

public class Mercedz extends Vehicle{
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
	public void MercedzSpeed() {
		System.out.println("The speed of the Mercedzcar is 120km/hr");
		
	}
	public static void MercedzWeight() {
		System.out.println("The weight of the Mercedzcar is 150kgs");
	}
	 public void MercedzAvailable() {
			System.out.println("The availability Mercedz cars are: 10");
		   }
	
}
