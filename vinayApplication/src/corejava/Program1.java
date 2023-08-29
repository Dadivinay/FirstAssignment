package corejava;

import java.util.Scanner;

// how to find missing number in java
public class Program1 {

	public static void main(String[] args) {
		//taking values in user
		System.out.println("enter  array numbers");
		int arr[] = new int[9];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum = (10*11)/2; //   (n*n+1/2);
		int actualsum=0;
		for(int i=0; i<arr.length; i++) {
			actualsum= actualsum+ arr[i];
		}
		System.out.println("missing number is  :"+(sum-actualsum));

	}

}
