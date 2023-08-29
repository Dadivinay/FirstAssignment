package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Airport {

	public static void main(String[] args) {
		int min;
		
		System.out.println("enter the array Numbers ");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		   for(int i=0; i<arr.length; i++) {
			   arr[i]=sc.nextInt();
		   } 
		   min = arr[0];
		   
		   for(int i=1; i<arr.length; i++) 
			   
		   if(arr[i]<min) {
			   min = arr[i];
		   }
			System.out.println("the smallest array element is "+min);  
		                                                                  
	}
}





