package corejava;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		 String kumar;
		 System.out.println(" enter any string");
		 Scanner sc = new Scanner(System.in);
		  kumar=sc.next();
		  String vinay = kumar;
		  String rev="";
		  int len=kumar.length();
		  for(int i=len-1; i>=0; i--) {
	       
				rev=rev+kumar.charAt(i);
	         }
	         if(vinay.equals(rev)) {
	        	 
	        	 System.out.println("given string is a  palindrome  :"+rev);
	         }
	         else {
	        	 System.out.println("given string is a not a palindrome  string  :"+rev);
	         }

		
		  }
		  
		 }
