package stackNqueue;

/**
 * 55%의 진척률(p), 하루에 5% 진행하는 속도(s).
 * 이때 총 몇일 걸리는 구하는 로직
 * 일단 결과(r)는 9일.
 */
public class Main03 {

	public static void main(String[] args) {
		
		int p = 55;
		int s = 5;
		
		int r = 0;
		
		while(p < 100) {
			
			p += s;		// p = p + s;
			
			r++;
		}
		
		System.out.println("r : " + r);
	}
}
