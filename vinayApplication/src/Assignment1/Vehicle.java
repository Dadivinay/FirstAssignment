package Assignment1;

public class Vehicle {
	
	private int Tyres;
	private String Engine;
	private int seats;
	private String Model;
	public Mercedz obj;
	
	public int getTyres() {
		
		return Tyres;
		
	}
	public void setTyres(int tyres) {
		Tyres = tyres;
	}
	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	
	public int getSeats() {
		
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}	
}