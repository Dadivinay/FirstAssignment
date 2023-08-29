package com.vinsy.classpractice;

public class Person {
	
	String firstname;
	String Lastname;
	String Gender;
	Double Dateofbirth;
	Address address;
	ContactInfo object;
	
	
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	
	public  void walk() {
		System.out.println(this.firstname +"is walking");
	}
	
	void sleep() {
		System.out.println(this.firstname +"is sleeping");
		
	}
	
	void eat() {
		System.out.println(this.firstname + " is eating");
	}
	
		
}
