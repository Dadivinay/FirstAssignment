package corejava;

public class MinutestoYears {

	public static void main(String[] args) {
		/* int minutes = 3000010 ;

		 int year=minutes/(365*24*60);

		 System.out.println("Year=:"+year);

		 int days=minutes/(24*60)%365;

		 System.out.println("Days=:"+days);

		 int hours=minutes/60%24;

		 System.out.println("Hours=:"+hours);

		 int remainingminutes=minutes%60;

		 System.out.println("Second=:"+remainingminutes);


       */
		int minutes=5006808;
		int year=minutes/(365*24*60);
		System.out.println("year ="+year);
		int days=minutes/(24*60)%365;
		System.out.println("days ="+days);
		int hours=minutes/60%24;
		System.out.println("hours is ="+hours);
		int seconds=minutes%60;
		System.out.println("the remaining minutes are:"+seconds);
		
	}

}
