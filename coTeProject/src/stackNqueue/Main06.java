package stackNqueue;

public class Main06 {

	public static void main(String[] args) {
		// 아래의 경우,
		// 1일 째 되는 날, 1번째 건 배포.		총 1건의 배포진행
		// 3일 째 되는 날, 2번째 건 배포.		총 1건의 배포 진행
		// 9일 째 되는 날, 3번째 건 배포.		총 1건의 배포진행
		
		// 결과 배열
		// int[] result = {1, 1, 1};
				
		int[] cd = {1, 3, 9};	// cd : complete day
		
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
		
		// 배열 count 출력
		for(int i = 0; i < count.length; i++) {
			
			System.out.println("count[" + i + "] = " + count[i]);
		}
	}
}
