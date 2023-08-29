package com.vinsy.classpractice;

public class Employee extends Person{
	
	String salary;
	Department department;
	
	public  void printmethod() {
		 
		System.out.println(this.firstname);
		System.out.println(this.department.DepartmentName);
		

	}

}
