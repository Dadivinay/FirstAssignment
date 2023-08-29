package corejava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
	
		
		int a=212124;
		int b;
		b=a;
        int c;
        int d=0;
        while(a>0) {
        	 c=a%10;
        	 d=(d*10)+c;
        	 a=a/10;
        	
        }
        if(d==b) {
        	System.out.println("given number is palindrone");
        }
        else {
           System.out.println("given number is not a palindrome");
        }
		
	

	}

}
