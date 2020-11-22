package streamapi;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("alpha", "beta", "gamma", "delta", "epsilon");
		
		//기존 코딩방식
		long count = 0;
		for(String name : names) {
			if(name.contains("e")) count++;
		}
		System.out.println("count : " + count);	// 3
		
		// 스트림을 이용한 방식
		count = 0;
		count = names.stream().filter(x -> x.contains("e")).count();
		System.out.println("count = " + count);
	}
}
