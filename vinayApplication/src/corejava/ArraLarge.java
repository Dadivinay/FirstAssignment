package corejava;

import java.util.Scanner;

public class ArraLarge {

	public static void main(String[] args) {
		/*  int max;
	        System.out.println("enter array numbers");
	        int a[] = new int[10];
	        Scanner sc = new Scanner(System.in);
	        for(int i=0; i<a.length; i++) {
	        	a[i]=sc.nextInt();
	        }
	        max=a[0];
	        for(int i=0; i<a.length; i++) {
	        	if(a[i]>max) {
	        		max=a[i];
	        	}
	        }
	        	System.out.println("the largest array  is  :"+max);
	        	*/
		int  max;
		System.out.println("enter array numbers");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<max) {
				max = arr[i];
			}
		}
		System.out.println("the smallest array is :"+max);
	}
}
	        	
	   
