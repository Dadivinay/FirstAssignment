package corejava;

import java.util.Scanner;

public class PalindromeStrin {

	public static void main(String[] args) {
		System.out.println("enter  a  string");
		String  str;
		
		Scanner sc  = new Scanner(System.in);
		  str=sc.next();
		  
        String original = str;
        String rev="";
         int len = str.length();
         for(int i=len-1; i>=0; i--) {
        	rev=rev+str.charAt(i);
         }
         if(original.equals(rev)) {
        	 
        	 System.out.println("given string is a  palindrome  :"+rev);
         }
         else {
        	 System.out.println("given string is a not a palindrome  string  :"+rev);
         }

	}

}
