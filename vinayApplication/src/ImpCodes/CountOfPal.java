package ImpCodes;


                                   //jumble the strings 2
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CountOfPal {
	static int getCount(int N, List<String> s)
	{
		Map<List<Integer>, Integer> mp = new HashMap<>();
		
		int ans = 0;
		
		for(int i = 0; i < N; i++)
		{
			List<Integer> a = new ArrayList<>(26);
			for(int k = 0; k < 26; k++)
				a.add(0);

			for(int j = 0; j < s.get(i).length(); j++)
			{
				a.set((s.get(i).charAt(j) - 'a'),
				a.get(s.get(i).charAt(j) - 'a') + 1);
			}

			for(int j = 0; j < 26; j++)
			{
				a.set(j, a.get(j) % 2);
			}
			
			ans += mp.getOrDefault(a, 0);
			

			for(int j = 0; j < 26; j++)
			{
				List<Integer> ccount = new ArrayList<>();
				ccount.addAll(a);
				
				if (a.get(j) == 0)
					ccount.set(j, 1);
				else
					ccount.set(j, 0);
				
				ans += mp.getOrDefault(ccount, 0);
			}
			mp.put(a, mp.getOrDefault(a, 0) + 1);
		}
		return ans;
	}

	public static void main (String[] args)
	{
		int N = 4;
		List<String> A = Arrays.asList("mad", "malaya","abc","bac","lam", "am");
									
		System.out.print("The count of concatenated string pairs in the array that are palindromes :");
		
		System.out.print(getCount(N, A));
	}

}
