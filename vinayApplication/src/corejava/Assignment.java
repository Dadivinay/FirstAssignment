package corejava;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		/*Write a logic to calculate EMI for a customer who purchased a car worth Rs. 8,50,000,
		out of which the customer paid Rs.1,50,000 as down payment 
		and the remaining was taken per month as a loan with 12% Interest for 48 months .
                                                   */
	       Scanner sc = new Scanner (System.in);

		 System.out.println("Enter gross salary");

		 float grossSalary =  sc.nextInt();

		 System.out.println("Enter HRA ");

		 float hra = sc.nextFloat();

		 System.out.println("Enter PF amount");

		 int pf = sc.nextInt();

		 double annualSalary = getAnnualSalary(grossSalary);

		 System.out.println("Annual Salary " + annualSalary);

		 float deductions = calculateDeductions(hra,pf);

		 System.out.println("Deductions " + deductions);

		 double income = calculateIncome(annualSalary,deductions);

		 System.out.println("Income " + income);

		 calculateTaxOnIncome(income);

		 }

		 public static double getAnnualSalary(float grossSalary) {

		 return grossSalary * 12;

		 }

		 public static float calculateDeductions(float hra, int pf) {

		 return hra * 12 + pf * 12;

		 }

		 public static double calculateIncome(double annualSalary, float deductions) {

		 return annualSalary - deductions;

		 }

		 public static void calculateTaxOnIncome(double income) {

		 if (income >= 300000 && income <= 500000)

		 System.out.println("Total Tax on Income " + (income * 0.1));

		 else if(income > 500000 && income < 1000000)

		 System.out.println("Total Tax on Income " + (income * 0.2));

		 else if (income  >= 1000000)

		 System.out.println("Total Tax on Income " + (income * 0.3));

		 else

		 System.out.println("Total Tax on Income " + income );


	}

}
