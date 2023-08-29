package Assignment1;

public class Car extends Vehicle{

	private  String carname;
     private int carweight;
     private  String color;   
     
     Vehicle vehicle;
     
	public String getColor() {
		return getColor();
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
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void setCarweight(int carweight) {
		this.carweight = carweight;
	}

	public static void carSpeed() {
		
		System.out.println("The speed of the car is 100km/hr");
	}
	public static void carweight() {
		System.out.println("The weigth of the car is 110kg ");
	}
	public void carAvailable() {
		System.out.println("there are 10 cars avaible in car showroom");
	}

}

