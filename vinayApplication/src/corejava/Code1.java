package corejava;

public class Code1 {

	public static void main(String[] args) {
		/*int i=1;
		int sum=0;
		while(i<=20) {
			if(i%2==0) {
				sum +=i;
			}
			i++;
		}
		System.out.println(sum);
    */
		/*int n = 1;
        while (n <= 100) { 
            System.out.println("Hi");
            n *= 2;
        }
        */
		int n = 5;
        int a = 1;
        int count = 0;
        do {
            a++;
            if (a % n == 0)
                count++;
        } while (a <= 100);
        System.out.println(count);
	}

}
