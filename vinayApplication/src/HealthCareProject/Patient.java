package HealthCareProject;

public class Patient {
	
	  private int id;
	    private String name;
	    private int age;
	    private String condition;

	    public Patient(int id, String name, int age, String condition) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.condition = condition;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getCondition() {
	        return condition;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + "\nName: " + name + "\nAge: " + age + "\nCondition: " + condition;
	    }

}
