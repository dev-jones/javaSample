package stackNqueue;

/**
 * 30%의 진척률(p), 하루에 30% 진행하는 속도(s).
 * 이때 총 몇일 걸리는 구하는 로직
 * 일단 결과(r)는 3일.
 */
public class Main01 {

	public static void main(String[] args) {
		
		int p = 30;
		int s = 30;
		
		int r = 0;
		
		while(p < 100) {
			
			p += s;		// p = p + s;
			
			r++;
		}
		
		System.out.println("r : " + r);
	}
}
