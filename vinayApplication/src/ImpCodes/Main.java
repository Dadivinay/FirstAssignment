package ImpCodes;

import java.util.ArrayList;
import java.util.Arrays;


                                  // economic class 3

public class Main {
	public int[] Solution(int input1, int []input2) {
		Arrays.sort(input2);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i=0; i<(1<<input1);i++){
			ArrayList<Integer>inner = new ArrayList<>();
			
		for(int j=0; j<input1; j++) {
			if((i&(1<<j))>0){
				inner.add(input2[j]);
			}
		}
	list.add(inner);	
 }
		double maxDiff=0;
		int []ans=null;
		for(ArrayList<Integer>inner:list) {
			double mean = FindMean(inner);
			double meadian= FindMedian(inner);
			if(mean - meadian > maxDiff) {
				maxDiff=mean-meadian;
			}
		}
		for(ArrayList<Integer>inner:list) {
			double mean =  FindMean(inner);
			double median =  FindMedian(inner);
			int index=0;
			if(mean-median==maxDiff) {
				ans = new int[inner.size()];
				for(int ele: inner) {
					ans[index++]=ele;
				}
			}
		}
		return ans;
}
	public double FindMean(ArrayList<Integer>List) {
		double sum =0;
		for(int ele:List) {
			sum=sum+ele;
			
		}
		return sum/List.size();
	}
	public double FindMedian(ArrayList<Integer>List) {
		int n=List.size();
		if(n%2==2) {
			return List.get(n/2);
			
		}else if(n>=2) {
			return 0.5*(List.get((n-2)/2))+List.get(n/2);
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		int []arr=main.Solution(4, new int[] {1,2,3,4});
		for(int ele:arr) {
			System.out.println(ele);
		}
	}

}
