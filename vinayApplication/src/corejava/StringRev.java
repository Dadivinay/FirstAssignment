package corejava;

public class StringRev {

	public static void main(String[] args) {
		 
	 String str = "vinay";
		  char charr[] = str.toCharArray();
		 for(int i=charr.length-1; i>=0; i--) {
			 System.out.print(charr[i]);
		 }
		 // second process
		 for(int i=str.length()-1; i>=0; i--) {
			 System.out.print(str.charAt(i));
		 }
		 StringBuffer kumar = new StringBuffer(str);
		 System.out.println(kumar.reverse());
		 
		

	}

}
