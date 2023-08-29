package corejava;

public class TwoDimArr {

	public static void main(String[] args) {
	 /*syntax returntype array-name [] [];
		ex int x[][];
		construction of an array
		syntax 
		      arrayname = new datatype[rowsize][columnsize];
		      ex x=new int [2][3];
		*/
		int x [][]=  {{10,20,30},{40,50,60}};
		System.out.println("two  dimensional arrayelements  \n");
		for(int r=0; r<=1; r++) {
			for(int c=0; c<=2; c++) {
				System.out.print("");
				System.out.print(x[r][c]);
			}
		}

	}

}
