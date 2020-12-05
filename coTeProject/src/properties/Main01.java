package properties;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main01 {

	public static void main(String[] args) {
		
		File path = new File("C:\\test.properties");
		
		try(FileWriter file = new FileWriter(path)) {
			
			BufferedWriter bw = new BufferedWriter(file);
			
			String[] str = { "id = devjones", "pw = 12345", "name = 데브존스", "추가키 = 추가밸류" };
			
			for(String a : str) bw.write(a + '\n');
			
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
