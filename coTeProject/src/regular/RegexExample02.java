package regular;

import java.util.regex.Pattern;

public class RegexExample02 {

	public static void main(String[] args) {
		
		String name = "김카프";
		String tel = "010-1234-4833";
		String email = "test@naver.com";
		
		// 유효성 검사
		boolean name_check = Pattern.matches("^[가-힣]*$", name);
		boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{4})-\\d{4}$", tel);
		boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);
		
		// 출력
		System.out.println("이름 : " + name_check);
		System.out.println("전화번호 : " + tel_check);
		System.out.println("이메일 : " + email_check);
	}
}
