package Assignment;

import Assignment1.Vehicle;

public class Honda extends Bike{
	
	public String color;
	public int height;
	public String ModelName;
	 Bike bike;
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
public void HondaSpeed() {
		
		System.out.println("The speed of the ktm Bike is 120km/hr");
	}
	public void Hondaweight() {
		System.out.println("The weigth of the ktm Bike is 110kg ");
	}
	public void HondaAvailable() {
		System.out.println("there are 5 bikes avaible in ktm showroom");
	}

		

}
