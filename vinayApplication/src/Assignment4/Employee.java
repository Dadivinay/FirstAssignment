package Assignment4;

public class Employee  extends Person {
	
	int salary;
	Department department;
	public static void main(String [] args) {
		Employee vinay = new Employee();
		vinay.FirstName="ashok";
		vinay.LastName="dadi";
		vinay.Gender="male";
		vinay.DoB="2000";
		vinay.salary=5000;
		
		Department finance = new Department();
		
		       finance.DeptCode="101";
		       finance.DeptName="mechanical";
		       finance.DeptLocation="hyderabad";
		       
	}

}
