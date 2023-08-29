package com.vinsy.classpractice;

public class HumanBeing {
	
    private String FirstName;
    private String LastName;
    private String Email;
    
   private ContactInfo contactInfo;
    
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public ContactInfo getContactInfo() {
		
		return contactInfo;
		
	}
	
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	public void  printMethod() {
		
		System.out.println(this.contactInfo.getMail());
		
	}
	
	
}

    
	


