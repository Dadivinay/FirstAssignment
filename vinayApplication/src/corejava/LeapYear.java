package corejava;

import java.util.Scanner;

public class LeapYear {
	public static int LeapYear( int year) {
		
		if(year%400==0 || year%4==0 && year%100!=0) {
			
			System.out.println("given year is a leap year");
		}
		else{
			System.out.println("given year is a not a leap year");
			
			
		}
		return year;
	
	}


	public static void main(String[] args) {
		
		int year;
		
		System.out.println("enter a year :");
		 Scanner sc = new Scanner(System.in);
		   year=sc.nextInt();
		   int vinay= LeapYear(year);
		   System.out.println(vinay);
	/*
		if(year%400==0 || year%4==0 && year%100!=0) {
			
			
			System.out.println("given year is a leap year");
			
		}
			
			else {
				System.out.println("given yeaar is a not a leap year");
			}*/
		
		
		}

	}


