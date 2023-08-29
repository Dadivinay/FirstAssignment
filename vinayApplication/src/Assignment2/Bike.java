package Assignment2;

public class Bike {
	
	String brand;
	int Wheels;
	int speed;
	public Bike(String brand, int wheels, int speed) {
		super();
		this.brand = brand;
		this.Wheels = wheels;
		this.speed = speed;
	}
	void displayInfo() {
		
		System.out.println("Bike: "+ brand +",  Speed:"+ speed+ "km/hr");
		
	}
	
}
