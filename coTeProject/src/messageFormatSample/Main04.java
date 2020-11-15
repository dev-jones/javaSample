package messageFormatSample;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		 
        /* test.txt 파일내용 (해당 클래스와 같은 패키지 않에 존재함) 
        name: 이자바, number: 02-123-1234, birth: 07-09    
        name: 김프로, number: 031-112-2345, birth: 10-07
        */ 
 
        // 같은 패키지 않에 있으므로 해당클래스의 '절대경로'를 얻어옴
        String path = Main04.class.getResource("").getPath();
    
        // 절대경로 + 파일명
        String fileName = path +"test.txt";
        String pattern = "name: {0}, number: {1}, birth: {2}";
 
        Scanner s = null;
        // 파일이 존재하지 않을 경우를 위에 예외처리
        try {
            s = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
 
        MessageFormat mf = new MessageFormat(pattern);
 
        while(s.hasNextLine()) {
            String line = s.nextLine();
            Object[] objs = null;
            
            try { 
                objs = mf.parse(line);
            } catch (ParseException e) {
            e.printStackTrace();
            }
 
            System.out.println(MessageFormat.format(pattern, objs));
        }
        s.close();  // 작업이 끝나면 Scanner는 항상 닫아준다
    }
}
