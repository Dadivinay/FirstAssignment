package Assignment;

public class Bike {
	
	public int Tyres;
	
	public String Engine;
	
	public int  seat;
	
	public int getTyres() {
		
		return Tyres;
	}
	
	public void setTyres(int Tyres) {
		
		this.Tyres = Tyres;
	}
	public String getEngine() {
		
		return Engine;
	}
	public void setEngine(String engine) {
		
		this.Engine = engine;
	}
	public int getSeat() {
		
		return seat;
		
	}
	public void setSeat(int seat) {
		
		this.seat = seat;	
	}
	
	public static void TotalBikesAvailable() {
		
		System.out.println("Total 20 bikes are available in ShowRoom ");
		
	}
	public static void TotalBrandsAvailable() {
		System.out.println("They are Four Brands Availble Namely:Honda,Ktm,Pulsar,RoyalEnfield");
	}
	
	
	
	
	
	
}
