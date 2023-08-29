package corejava;

import java.util.Scanner;

public class ArraySmall {

	public static void main(String[] args) {
		int min;
		System.out.println("enter array numbers");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=1; i<arr.length; i++) {
			arr[i]=sc.nextInt();
	      
		}
		   min = arr[0];
		   for(int i=1; i<arr.length; i++) {
		   if(arr[i]<min) 
			   min=arr[i];
		   }
		   System.out.println("the smallest number is  :"+min);

	}

}
