package HumanAssignment;

public class Doctor extends Person{

	public Doctor(String name) {
		super(name);
	
	}
	public void heal() {
        System.out.println(name + " (Doctor) is treating patients.");
    }

}
