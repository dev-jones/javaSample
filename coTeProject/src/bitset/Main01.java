package bitset;

import java.util.BitSet;

public class Main01 {

	public static void main(String[] args) {
		
		BitSet b = new BitSet();
		b.set(2);
		
		System.out.println(b.get(2));
		b.flip(2);
		
		System.out.println(b.get(2));
	}
}
