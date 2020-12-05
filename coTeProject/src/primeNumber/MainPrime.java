package primeNumber;

public class MainPrime {

	/**
	 * 주어진 자연수 n이 소수인지 판별한다.
	 * @param n
	 * @return boolean
	 */
	public static boolean isPrime(int n) {
		
		// 예외처리 : 1과 2는 예외로 처리한다.
		if(n <= 1) return false;
		if(n == 2) return true;
		// 2를 제외한 모든 짝수는 소수가 아니다.
		if(n % 2 == 0) return false;
		
		// 3 이상의 모든 홀수로 나누자.
		int sqrtn = (int)Math.sqrt(n);	// n이 p x q로 표현될 때 한 수는 항상 루트n 이하, 다른 한 수는 항상 루트n 이상이라는 점에서 루트n까지만 순회하도록 최적화
		
		for(int div = 3; div <= sqrtn; div += 2) {
			
			if(n % div == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(100801));;
	}
}
