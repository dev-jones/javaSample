package bitset;

import java.util.BitSet;

public class MyBitSet {

	public static void main(String[] args) {
		
		/**
		 * 토핑 목록
		 * 01 : 할리피뇨
		 * 02 : 올리브
		 * 03 : 양파
		 */
		BitSet pizza = new BitSet();
		
		// 할리피뇨를 추가한다.
		pizza.set(01);
		
		// 올리브를 추가한다.
		pizza.set(02);
		
		// 양파를 추가한다.
		pizza.set(03);
		
		System.out.println(pizza);
		
		// 할리피뇨가 추가됬는지 확인한다.
		System.out.println(pizza.get(01));
		
		// 할리피뇨를 빼고싶다.
	}
}
