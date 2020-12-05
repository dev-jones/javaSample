package primeNumber;

import java.util.Vector;

public class PrimeFactorization {

	static Vector<Integer> factorSimple(int n) {
		
		Vector<Integer> ret = new Vector<Integer>();
		int sqrtn = (int)Math.sqrt(n);
		
		for(int div = 2; div <= sqrtn; div++) {
			
			while(n % div == 0) {
				n /= div;
				
				ret.
			}
		}
		
		
		
		return ret;
	}
}
