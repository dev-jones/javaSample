package properties;

import java.io.File;
import java.io.FileWriter;
import java.util.Properties;

public class main02 {

	public static void main(String[] args) {
		
		File path = new File("C:\\test02.properties");
		
		try(FileWriter file = new FileWriter(path)) {
			
			Properties p = new Properties();
			
			p.setProperty("id", "devjones01");
			p.setProperty("pw", "1234501");
			p.setProperty("name", "데브존스01");
			
			p.store(file, "devjones의 정보");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
