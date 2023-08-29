package Assignment;

import Assignment1.Tata;
import Assignment1.Vehicle;

public class Pulsar  extends Bike {
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
	public void pulsaraSpeed() {
		System.out.println("The speed of the pulsar Bike is 100km/hr");
	}
	public void pulsarweight() {
		System.out.println("The weigth of the pulsar Bike is 110kg ");
	}
	public void pulsarAvailable() {
		System.out.println("there are 3 bikes avaible in pulsar showroom");
	}



}
