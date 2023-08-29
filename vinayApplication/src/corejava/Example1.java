package corejava;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
		int num ;
		System.out.println("enter any number");
		
		Scanner sc = new Scanner(System.in);
		     num=sc.nextInt();
		     while(num!=0) {
		    	 int rev=0;
		    	 rev=rev*10+num%10;
		    	 num=num/10;
		    	 System.out.print(rev);
		     }
		    

	}

}
