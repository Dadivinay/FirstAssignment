package corejava;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		 String str=sc.next();
		 String orgstring  = str;
		    String rev="";
		 int len=str.length();
		 for(int i=len-1; i>=0; i--) {
			 rev=rev+str.charAt(i);
			 
		 }
		 if(orgstring.equals(rev)) {
			 System.out.println("The reverse String is a palinndrome :"+rev);
		 }
		 else {
			 System.out.println("The reverse String is not a palindrome:");
		 }


	}

}
