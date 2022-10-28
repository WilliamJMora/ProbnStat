public class CombPerm {
	
	// calculates a factorial
	public static int factorial(int x) {
		
		int fact = 1;
		
		for (int i = 1; i <= x; i++) {
			
			// multiplies 1 by all numbers up to and including x
			fact = fact * i;
			
		}
		
		return fact;
		
	}
	
	// combination formula
	public static double combination(int n, int r) {
		
		double comb = 0;
		
		comb = factorial(n) / (factorial(r) * factorial(n-r));
		
		return comb;
		
	}
	
	// permutation formula
	public static double permutation(int n, int r) {
		
		double perm = 0;
		
		perm = factorial(n) / factorial(n-r);
		
		return perm;
	}


}