package com.vinsy.classpractice;

public class Main {

	public static void main(String[] args) {

		  Employee employee = new Employee();
		  
		  employee.setFirstName("Venkat");
		  employee.Lastname="dadi"; 
		  employee.Dateofbirth=2000.0;
		  System.out.println(employee.firstname+employee.Lastname+employee.Dateofbirth);
		  
		  Address vinayAddress= new Address(); 
		 
		  vinayAddress.adrln1="line1";
		  vinayAddress.adrln2="line2";
		  vinayAddress.City="Hyderabad";
		  vinayAddress.landMark="South India Mall";
		  vinayAddress.pincode=500014;
		  System.out.println(vinayAddress.adrln1+","+vinayAddress.adrln2+","+vinayAddress.City+","+vinayAddress.landMark+","+vinayAddress.pincode);

		 ContactInfo contacts= new ContactInfo(); 
		 
		 contacts.mail="test@gmail.com";
		 
		 
		  Department softwareDept = new Department();
		      softwareDept.Departmentcode=101;
	 		  softwareDept.DepartmentName="Software";
	 		  
		  employee.department=softwareDept;
		  employee.address=vinayAddress;
		  employee.object=contacts;
		  employee.eat(); 
		  
		//  employee.printmethod();
		  
		ContactInfo info = new ContactInfo();
		
      	HumanBeing human = new HumanBeing();
		
		human.setFirstName("vinay");
		human.setLastName("kumar");
		human.setEmail("vinay@gmail.com");
		info.setAdress("hyderabad");
		info.setMail("venku@gmail.com");
		
	 human.setContactInfo(info);
		System.out.println(info.getAdress());
		System.out.println(info.getMail());
	System.out.println(human.getContactInfo().getMail());
		
	}      

}
