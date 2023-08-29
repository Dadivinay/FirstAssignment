package corejava;

public class RevStr {

	public static void main(String[] args) {
		String str="premanand";
		char[] charr = str.toCharArray();
		for(int i=charr.length-1; i>=0; i--) {
			System.out.print(charr[i]);
		}
		System.out.println();
		
		//second approach
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
