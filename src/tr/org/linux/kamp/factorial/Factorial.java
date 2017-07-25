package tr.org.linux.kamp.factorial;

public class Factorial {
	
	public static int factorial(int x) {
		
		int fact = 1;
		for(int i = 2; i<= x; i++) {
			fact *= i;
			
		}
		return fact;
	}

}
