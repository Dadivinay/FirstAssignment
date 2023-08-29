 
package Assignment;

public class BikeMain {

	public static void main(String[] args) {
		
		Honda honda =new Honda();
		Ktm tm = new Ktm();
		
		honda.setColor("orange");
		
		honda.setEngine("heavy engine");
		
		System.out.println(honda.getColor());
		
		System.out.println(honda.getEngine());
		System.out.println(honda.getHeight());
		
		
	}
}
