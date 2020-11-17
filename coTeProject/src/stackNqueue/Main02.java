package stackNqueue;

/**
 * 93%의 진척률(p), 하루에 1% 진행하는 속도(s).
 * 이때 총 몇일 걸리는 구하는 로직
 * 일단 결과(r)는 7일.
 */
public class Main02 {

	public static void main(String[] args) {
		
		int p = 93;
		int s = 1;
		
		int r = 0;
		
		while(p < 100) {
			
			p += s;		// p = p + s;
			
			r++;
		}
		
		System.out.println("r : " + r);
	}
}
