package Assignment2;

public class VehicleMain {

	public static void main(String[] args) {
		Bike mybike = new Bike("Pulsar", 25, 5);
		Car mycar = new Car("Toyota", 120, 10);
		mybike.displayInfo();
		mycar.displayInfo();

	}

}
