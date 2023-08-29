package corejava;

public class StarPattern {

	public static void main(String[] args) {
		/*int n=10;
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		} */
		int n=5, num=1;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(num+" " );
				num=num+1;
			}
			System.out.println( );
		}
	}

}

