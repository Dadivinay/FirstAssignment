package Assignment9;

public class Main {

	public static void main(String[] args) {
	
		Helicaptor helicopter = new Helicaptor();
		
        Airplane airplane = new Airplane();
        
        // Flying actions in Helicaptor and Airplane
        
        helicopter.fly();
        airplane.fly();
        
        // Landing actions in Helicaptor Airplane
        
        helicopter.land();
        airplane.land();


	}

}
