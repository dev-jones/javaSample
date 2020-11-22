package linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main01 {

	public static void main(String[] args) {
		
		// 선언
		LinkedList list = new LinkedList();
		LinkedList<String> strList = new LinkedList<String>();
		LinkedList<Integer> intList = new LinkedList<Integer>();
		LinkedList<Integer> intList1 = new LinkedList<Integer>(Arrays.asList(1, 2));
		
		// LinkedList는 인스턴스 생성 시 크기를 미리 정할 수 없다!
		
		
		// LinkedList 값 추가
		intList.addFirst(1);	// 가장 앞에 데이터추가
		intList.addLast(2);		// 가장 뒤에 데이터추가
		intList.add(3);			// 데이터 추가
		intList.add(1, 10);		// index 1뒤에 데이터 10추가
		
		
		// LinkedList 값 출력
		
		// 1. 내방식
		for(int i = 0; i < intList.size(); i++) {
			
			System.out.println(intList.get(i));
		}
		System.out.println("==========");
		
		// 2. forEach
		for(Integer i : intList) {
			System.out.println(i);
		}
		System.out.println("==========");
		
		// 3. iterator
		Iterator<Integer> iter = intList.iterator();
		while(iter.hasNext()) {	// 다음 값이 있다면...
			System.out.println(iter.next());
		}
		
		
		// LinkedList 값 검색
		intList.contains(1);	// intList에 1이 있는지 검색
		intList.indexOf(1);		// 1이 있는 index반환. 없으면 -1
	}
}
