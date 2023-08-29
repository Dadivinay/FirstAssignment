package ImpCodes;

public class FindMax1 {
/*
		public static int findMax(int input1[],String input2, int input3){
			int res =0, i =0;
			if(input3 > 0){
				for(int e : input1){
					res = input2.charAt(i++) =='P'? res+e: res-e;
					
				}
				if( res > 0){
					return res* (100);
				}
					else
						return res*(-100);
					
			}
			return res;
		}

		public static void main(String[] args) {
			
			int input1[] = {3,2};
			String input2 = "PN";
			int input3 = 3;
			
			System.out.println(findMax(input1, input2, input3));
		}
		*/
		
		//another model
		public static int findMax(int input1[],String input2, int input3 ){
			int sum =0;
			for( int i = 0; i < input1.length; i++){
				if(input2.charAt(i) == 'P'){
					sum += input1[i];
					
				}else{
					sum -= input1[i];
				}
			}
			return sum*100;
		}

		public static void main(String[] args) {
			
			int input1[] = {3,2};
			String input2 = "PN";
			int input3 = 3;
			
			System.out.println(findMax(input1, input2, input3));
		}


	}


