package corejava;

public class SwapNum {

	public static void main(String[] args) {
		int  a=10;
		int b=20;
		int temp;
	System.out.println("before swapinng :"+a +"," +b);
	
	/*
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swaping :"+a+","+b);
		*/
	// logic 2 using + and - without using third variable
		/*a=a+b;//a=10, b=20 total 30
		b=a-b;// 30-20 total 10
		a=a-b;//  30-10 total 20
		System.out.println("after swaping loggic two :"+a+","+b);*/
 // logic three we use * and / operators
		/*a=a*b;
		b=a/b;
		a=a/b;System.out.println("after swaping logic three is :"+a+","+b);
		*/
	/*a=a^b;
	b=a^b;
	a=a^b;
  System.out.println("after swaping logic four is :"+a+","+b);
   */
	
	b=a+b-(a=b);
	System.out.println(" "+a+" "+b+" ");
	
	}
}





