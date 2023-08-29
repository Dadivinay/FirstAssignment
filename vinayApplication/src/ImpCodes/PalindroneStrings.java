package ImpCodes;
                                //jumble the strings
public class PalindroneStrings {
	public static int polidromePairs(String [] input1, int input2){
		   int count = 0;
		   for(int i =0; i < input2; i++){
			   String s1 = input1[i];
			   for(int j = i+1; j < input2; j++){
				   String s2 = input1[j];
				   String concatenated = s1+s2;
				   if(isPolidrome(concatenated)){
					   count++;
				   }
			   }
		   }
		   return count;
	   }
	   public static boolean isPolidrome(String s){
		   int[] charCounts = new int[26];
		   for(char c : s.toCharArray()){
			   charCounts[c - 'a']++;
		   }
		   int oddCount = 0;
		   for(int count : charCounts){
			   if(count % 2 == 1){
				   oddCount++; 
			   }
			   if( oddCount > 1){
				   return false;
			   }
		   }
		   return true;
	   }
		public static void main(String[] args) {
			String [] input1 = {"ac", "bb", "dd"};
			int input2 = 3;
			
			System.out.println(polidromePairs(input1,input2));
			
	    
		}

	}


