package messageFormatSample;

import java.text.MessageFormat;

public class Main01 {

	public static void main(String[] args) {
		
		String pttrn = "첫번째 : {0} \n두번째 : {1} \n세번째 : {2} \n네번째  : {3}";
		Object[] arguments = {"가나다", "ABC", "123", "!@#"};
		
		String result = MessageFormat.format(pttrn, arguments);
		System.out.println(result);
	}
}
