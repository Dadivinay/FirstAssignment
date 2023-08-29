package corejava;

import java.util.Scanner;

public class ArrRev {

	public static void main(String[] args) {
	          System.out.println("enter any  number");
	          Scanner sc = new Scanner(System.in);
	           int arr[]= new int[10];
	          for(int i=0; i<arr.length; i++) {
	        	  arr[i]=sc.nextInt();
	          }
	          for(int y=arr.length-1;y>=0; y--) {
	        	  System.out.println(arr[y]);
	        	  
	          }

	}

}
