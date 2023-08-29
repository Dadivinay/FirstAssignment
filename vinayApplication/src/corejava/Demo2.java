package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
	/*public static void secondlarge(int arr[]) {
		int size = arr.length;
		if(size<2) {
			System.out.println("invalid input");
			return;
		}
		Arrays.sort(arr);
		//System.out.println("The second largest array is:"+arr[size-2]);
		for(int i=size-1; i>=0; i--) {
			if(arr[i] != arr[size-1]) {
				System.out.println("the second largest array is :"+arr[i]);
				return;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[7];
		System.out.println("enter array values");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		secondlarge(arr);

		
			
		}*/
	public static void secondLargeArray(int arr[]) {
		int size = arr.length;
		if(size<2) {
			System.out.println("invalid input");
			return;
		}
		Arrays.sort(arr);
	//	System.out.println("the secong largest array is:"+arr[size-2]);
		for(int i=size-1; i>=0;  i--) {
			if(arr[i] != arr[size-1]) {
			System.out.println("the second largest number is:"+arr[i]);
			
           return;
			}
		}
	}
		public static void main(String [] args) {
		  System.out.println("enter array values");
		  Scanner sc = new Scanner(System.in);
		  int arr[] = new int[10];
		  for(int i=0; i<arr.length; i++) {
			  arr[i]=sc.nextInt();
		  }
		  secondLargeArray(arr);
		}

	}

