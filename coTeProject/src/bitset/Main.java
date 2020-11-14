package bitset;

import java.util.BitSet;

public class Main {

	public static void main(String[] args) {
		
		BitSet b = new BitSet();
		b.set(10);
		b.set(100);
		
		System.out.println(b.get(10));
		System.out.println(b.get(100));
		System.out.println(b.get(0));
	}
}
