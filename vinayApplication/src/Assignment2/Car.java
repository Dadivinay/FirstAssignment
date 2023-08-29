package Assignment2;

public class Car {
	
	String make;
	int wheels;
	int speed;
	

	public Car(String make, int wheels, int speed) {
		super();
		this.make = make;
		this.wheels = wheels;
		this.speed = speed;
	}
	void displayInfo() {
		System.out.println("car: "+make +", speed :"+speed+"km/hr");
	}

}
