package regular;

import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		
		String pattern ="^[0-9]*$";
		String val = "234890234820";
		
		boolean regex = Pattern.matches(pattern, val);
		System.out.println(regex);
	}
}
