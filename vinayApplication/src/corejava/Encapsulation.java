package corejava;

public class Encapsulation {
	String name;
	int roono;
	
	

	public Encapsulation(String name, int roono) {
		super();
		this.name = name;
		this.roono = roono;
	}


	public Encapsulation() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoono() {
		return roono;
	}


	public void setRoono(int roono) {
		this.roono = roono;
	}


	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation ();
		obj.setName("vinay");
		obj.setRoono(10);
		obj.setName("kumar");
		obj.setRoono(15);
		System.out.println(obj.getName());
		System.out.println(obj.getRoono());
	}

}
