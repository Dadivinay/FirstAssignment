package ImpCodes;

import java.util.Arrays;

public class Chemical {

	public static int numberOfPairs( int input1, String[] input2){
		String temp ="";
		int count =0;
		for(int i = 0; i < input1; i++){
			
			for( int j =0; j < input1; j++){
				temp = input2[i] + input2[i];
				if(temp.length() == input2[j].length()){
					char [] c = temp.toCharArray();
					Arrays.sort(c);
					char [] s = input2[j].toCharArray();
					Arrays.sort(s);

					if(Arrays.equals(c,s)){
					     count++;
					}
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {

//		int input1 = 5;
//		String[]input2 = {"hacker", "int", "niitnt", "hackhackerer", "long"};
		int input1 = 3;
		String[]input2 = {"medium", "easy", "yeasseya"};
		System.out.println(numberOfPairs(input1,input2));

	}

       


}
