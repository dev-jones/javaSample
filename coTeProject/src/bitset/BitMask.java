package bitset;

public class BitMask {

	public static void main(String[] args) {
		
		// 피자집 예제
		// 토핑 종류는 20개를
		// 비트마스크를 이용해 표현해보자.
		
		// 토핑이 아무것도 없는, 즉 공집합을 표현
		int noToppingPizza = 0;
		
		// 20가지 토핑 모두 얹은 피자
		int fullToppingPizza = (1 << 20) - 1;	// << 연산자 설명하기!
		
		// 원소 추가
		int toppings = 0;	// 최초에는 토핑이 아무것도 없음
		int p = 3;	// 원래 p(0<=p<20) 이지만, 여기서는 3이라 가정한다.
		toppings = toppings | (1 << p);
		
		// 원소의 포함 여부 확인
		//System.out.println(toppings & (1 << p));
		if((toppings & (1 << p)) == (1 << p)) System.out.println("pepperoni is in!");
		else if((toppings & (1 << p)) == 0) System.out.println("NO pepperoni!");
		
		// 원소의 삭제
		// toppings -= (1 << p);	toppings의 값이 음수가 됨!
		toppings &= ~(1 << p);		// ~의 의미는?
		
		// 원소의 토글
		toppings ^= (1 << p);
		
		// 두 집합에 대해 연산하기
		/*
		김현식이 좋아하는 토핑목록(a), 최용호가 좋아하는 토핑목록(b)
		에 대하여
		
		in
		*/
		
		// 집합의 크기 구하기
		Integer.bitCount(toppings);	// 자바에서 제공함-_-;
		System.out.println(bitCount(toppings));
	}
	
	// 집합의 크기 구하기
	public static int bitCount(int x) {
		
		if(x == 0) return 0;
		
		return x % 2 + bitCount(x / 2);
	}
}
