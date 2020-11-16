package simpledateformatSample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		
		// 날짜 형식을 String으로 혹은 String을 날짜 형식으로 변환하기 위한 포맷 형식
		DateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		
		// Calendar 형식에서 날짜를 가져온다. 특이점은 Calendar가 singleton형식이다.
		// Date값을 가져와서 String으로 변환한다.
		String dateStr = fm.format(Calendar.getInstance().getTime());
		System.out.println(dateStr);
		
		// String형식을 Date형식으로 변환한다.
		try {
			Date date = fm.parse("2020/11/16");
			System.out.println("date : " + date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
