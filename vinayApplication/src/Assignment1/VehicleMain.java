package Assignment1;

import  Assignment.Bike;
import Assignment.BikeMain;
import Assignment.Honda;
import Assignment.Ktm;
import Assignment.Pulsar;
import Assignment.RoyalEnfield;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		
		   Kia obj = new Kia();
		   
		   Mercedz obj1 = new Mercedz();
		   
		   Tata obj2 = new Tata();
		   
		   Car obj3 = new Car();
		   
		   RoyalEnfield rf = new RoyalEnfield();
		   rf.setEngine("High Performance engine");
		   System.out.println(rf.getEngine());
		 
		   obj.vehicle=obj2;
		   	   
		   vehicle.setEngine("Low Speed Engine");
		   obj.setCarname("kia");
		   obj.setColor("orange");
		   obj.setEngine("High speed engine");
		   obj.setVehicle(vehicle);
		   
		   System.out.println(vehicle.getEngine());
		   
		   System.out.println(obj.getEngine());
		   System.out.println(obj.getColor());
		   System.out.println(obj.getVehicle().getEngine());
		   
	}
}





