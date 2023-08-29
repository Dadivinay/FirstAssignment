package corejava;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		/*System.out.println("enter a number");
		int a,b,c,d=0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=a;
        while(a>0) {
        	 c=a%10;
        	 d=(c*c*c)+d;
        	 a=a/10;
        }
        if(d==b) {
        	System.out.println("given number is armstrong number");
        }
        else {
           System.out.println("given number is not an arm strong number");
        }
		*/
		int a,b,temp;
		a=100;
		b=200;
		 System.out.println("before swaping :"+a+","+b);
		/* temp=a;
		 a=b;
		 b=temp;
		 System.out.println("after swaping :"+a+","+b);
		 */
		 a=a*b;
		 b=a/b;
		 a=a/b;
		 System.out.println("after swaping second approach "+a +","+b);
	


	}

}
