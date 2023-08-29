package corejava;

public class NumberReverse {

	public static void main(String[] args) {
    /*   long num=346724976507l;
       long rev=0;
       while(num!=0) {
    	   rev=rev*10+num%10;
    	   num = num/10;
    	   
       }
       System.out.println(rev);*/
		
		long num=12345677l;
		
		long rev=0;
		
		while(num!=0) {
		
		rev=rev*10+num%10;
		num=num/10;
		
		}
		System.out.println(rev);
       

	}

}
