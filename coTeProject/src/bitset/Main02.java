package bitset;

import java.util.BitSet;

public class Main02 {

	public static void main(String[] args) {
		
		BitSet b = new BitSet();
		b.set(3);
		b.set(5);
		
		BitSet b2 = b.get(3, 6);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println(b2.get(i));
		}
	}
}
