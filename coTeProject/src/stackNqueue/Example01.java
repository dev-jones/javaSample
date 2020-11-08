package stackNqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example01 {

	/*
	
		PriorityQueue
			Queue 인터페이스의 구현체 중 하나로, 저장한 순서에 관계없이 우선순위(priority)가 높은 것부터 꺼내게 된다는 특징이 있다.
			null을 저장하면 NullPointerException을 발생한다.
			PriorityQueue는 저장공간으로 배열을 사용하며,
			각 요소를 힙(heap)이라는 자료구조의 형태로 저장한다.
			
	*/
	
	public static void main(String[] args) {
		
		Queue pq = new PriorityQueue();
		
		pq.offer(3);	// 원래는 pq.offer(new Integer(3)); 해야하는데 오토박싱
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println("pq : " + pq);
		
		Object obj = null;
		
		// PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
		while((obj = pq.poll()) != null) {
			System.out.println("obj : " + obj);
		}
		
		/*
			우선순위는 숫자가 작을수록 높아져서 1이 가장 먼저 출력된다.
			숫자가 아닌 객체를 저장하려면 각 객체의 크기를 비교할 수 있는 방법을 제공해야 한다.
			배열에 저장된 순서와 실제 우선순위가 다른것은 PriorityQueue가 각 요소를 힙이라는 자료구조의 형태로 저장한 것이라 그렇다.
		 */
		
		/*
		 * Deque(Double-Ended Queue)
		 * 
		 * Queue의 변형으로, 한쪽 끝으로만 추가/삭제할 수 있는 Queue와 달리, Deque는 양쪽 끝에서 추가/삭제가 가능하다.
		 * Deque의 조상은 Queue이며, 구현체로는 ArrayDeque와 LinkedList 등이 있다.
		 */
	}
}
