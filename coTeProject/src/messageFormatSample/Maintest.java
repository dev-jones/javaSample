package messageFormatSample;

public class Maintest {

	public static void main(String[] args) {
		
		Object[][] argument = {{"이자바", "29세", "경기도", "학생"}, {"김프로", "34세", "서울", "직장인"}};
		
		// 2차원배열의 크기 복습차원
		//System.out.println(argument.length);
		//System.out.println(argument[0].length);
		
		for(int i = 0; i < argument.length; i++) {
			
			for(int j = 0; j < argument[i].length; j++) {
				
				System.out.print(argument[i][j] + "\t");
			}
			
			System.out.println("");
		}
	}
}
