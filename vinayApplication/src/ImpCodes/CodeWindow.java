package ImpCodes;

import java.util.Scanner;
                          //ElectroStatics 1
public class CodeWindow {
	 public static void main(String[] args)
	    {
	    	System.out.println("enter values");
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        String s = sc.nextLine();
	        int n = sc.nextInt();
	        int charge[] = new int[n];
	        int count = 0;
	        for(int i=0;i<str.length();i++)
	            if(str.charAt(i) != ' ') {
	                charge[count] = str.charAt(i)-48;
	                count++;
	            }
	        int sum = 0;
	        for(int i=0;i<n;i++) {
	            if(s.charAt(i) == 'P')
	                sum += charge[i];
	            else
	                sum -= charge[i];
	        }
	        
	        if(sum > 0) {
	            System.out.println(sum*100);
	        }
	        else {
	            System.out.println(-sum*100);
	        }
	    }


}
