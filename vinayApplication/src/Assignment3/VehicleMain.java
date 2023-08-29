package Assignment3;

public class VehicleMain {

	public static void main(String[] args) {
	
		      
		        class Honda extends Vehicle {
		            public Honda() {
		                super("Honda Bike");
		            }
		        }

		        class Yamaha extends Vehicle {
		            public Yamaha() {
		                super("Yamaha Bike");
		            }
		        }

		        
		        class Toyota extends Vehicle {
		            public Toyota() {
		                super("Toyota Car");
		            }
		        }

		        class Ford extends Vehicle {
		            public Ford() {
		                super("Ford Car");
		            }
		        }

		    
		        Vehicle hondaBike = new Honda();
		        Vehicle yamahaBike = new Yamaha();
		        Vehicle toyotaCar = new Toyota();
		        Vehicle fordCar = new Ford();

		        hondaBike.displayInfo();
		        yamahaBike.displayInfo();
		        toyotaCar.displayInfo();
		        fordCar.displayInfo();
		 

	}

}
