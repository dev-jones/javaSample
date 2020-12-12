package primeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PrimeFactorization {

//	static Vector<Integer> factorSimple(int n) {
//		
//		Vector<Integer> ret = new Vector<Integer>();
//		int sqrtn = (int)Math.sqrt(n);
//		
//		for(int div = 2; div <= sqrtn; div++) {
//			
//			while(n % div == 0) {
//				n /= div;
//				
//				ret.
//			}
//		}
//		
//		
//		
//		return ret;
//	}
	
//	static int[] factorSimple(int n) {
//		
//		int[] ret = {};
//		
//		int sqrtn = (int)Math.sqrt(n);
//		
//		for(int div = 2; div <= sqrtn; div++) {
//			
//			while(n % div == 0) {
//				
//				n /= div;
//				ret[div -2] = div;
//			}
//		}
//		
//		return ret;
//	}
//	
//	public static void main(String[] args) {
//		
//		int[] result = factorSimple(2000);
//		
//		for(int intArr : result) {
//			
//			System.out.println("intArr : " + intArr);
//		}
//	}
	
	static List<Integer> factorSimple(int n) {
		
		List<Integer> ret = new ArrayList<Integer>();
		
		int sqrtn = (int)Math.sqrt(n);
		
		for(int div = 2; div <= sqrtn; div++) {
			
			while(n % div == 0) {
				
				n /= div;
				ret.add(div);
			}
		}
		
		if(n > 1) ret.add(n);
		
		return ret;
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> result = factorSimple(123456899);
		
		for(int a : result) {
			
			System.out.println("a : " + a);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
