package properties;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		File path = new File("C:\\userProp.properties");
		
		try(FileReader file = new FileReader(path)) {
			
			Properties p = new Properties();
			p.load(file);
			
			System.out.println(p.getProperty("id", "pw"));
			System.out.println(p.getProperty("pw"));
			System.out.println(p.getProperty("name"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
