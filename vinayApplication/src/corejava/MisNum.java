package corejava;

import java.util.Scanner;

public class MisNum {

	public static void main(String[] args) {
		System.out.println("enter a number");
		int arr[] = new int[9];
	   Scanner sc = new Scanner(System.in);
	   for(int i=0;i<arr.length; i++) {
		   arr[i]=sc.nextInt();
	   }
	    int sum=(10*11)/2;
	    int actualsum=0;
	    for(int i=0; i<arr.length; i++) {
	    	actualsum=actualsum+arr[i];
	    }
	    System.out.println("the missing number is:"+(sum-actualsum));

	}

}


