package Assignment;

import Assignment1.Vehicle;

public class RoyalEnfield extends Bike {

	public String color;
	public int height;
	public String ModelName;
	public Bike bike;
	Vehicle vehicle;
	
	public Bike getBike() {
		
		return bike;
	}
	public void setBike(Bike bike) {
		
		this.bike = bike;
	}
	public String getColor() {
		
		return color;
	}
	public void setColor(String color) {
		
		this.color = color;
	}
	public int getHeight() {
		
		return height;
	}
	public void setHeight(int height) {
		
		this.height = height;
	}
	public String getModelName() {
		
		return ModelName;
	}
	public void setModelName(String modelName) {
		
		ModelName = modelName;
	}
	public void RoyalEnfieldSpeed() {
		
		System.out.println("The speed of the RoyalEnfield Bike is 90km/hr");
	}
	public void RoyalEnfieldweight() {
		System.out.println("The weigth of the RoyalEnfield Bike is 150kg ");
	}
	public void RoyalEnfieldAvailable() {
		System.out.println("there are 2 bikes avaible in RoyalEnfield showroom");
	}

}
