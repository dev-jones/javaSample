package stackNqueue;

public class Main05 {

	public static void main(String[] args) {
		// 아래의 경우,
		// 7일 째 되는 날, 1번째 건과 2번째 건이 배포. 총 2건의 배포진행
		// 9일 째 되는 날, 3번째 건 배포.			    총 1건의 배포진행
		
		// 결과 배열
		// int[] result = {2, 1};
				
		int[] cd = {7, 3, 9};	// cd : complete day
		
		int count[] = {};
		
		for(int i = 0; i < cd.length -1; i++) {

			System.out.println("cd[" + i + "] = " + cd[i]);
			System.out.println("cd[" + (i + 1) + "] = " + cd[i + 1]);
			System.out.println("============");

			if(cd[i] > cd[i + 1]) {
				count[i] = 2;
			}
			if(cd[i] < cd[i + 1]) {
				count[i] = 2;
			}
		}
	}
}
