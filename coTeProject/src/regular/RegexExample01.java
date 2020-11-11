package regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample01 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
		String val = "asdkfj";
		
		Matcher matcher = pattern.matcher(val);
		System.out.println(matcher.find());
	}
}
