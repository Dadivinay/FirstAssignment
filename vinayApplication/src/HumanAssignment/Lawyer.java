package HumanAssignment;

public class Lawyer extends Person {

	public Lawyer(String name) {
		
		super(name);
		
	}
	public void advocate() {
        System.out.println(name + " (Lawyer) is advocating in court.");
    }

}
