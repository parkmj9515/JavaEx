package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		//	큐 선언
		//	q는 인터페이스
		//	실제 저장은 LinkedList 기능을 활용
		Queue<Integer> queue =	new LinkedList<>();	//	linkedlist활용 중간 삽입 삭제 가능
		
		for(int i=0; i <10; i++) {
			queue.offer(i);	//	입력(제공)
			System.out.println("Queue: "+queue);
		}
		
			System.out.println("Peek: "+queue.peek());	//	출력 방향의 데이터 확인
			System.out.println("Pool: "+queue.poll());	//	인출 , 출력후 삭제
			System.out.println("Queue: "+queue);

			//	Poll > 비어있는지 확인 *필
			while(!queue.isEmpty())	{	//	q가 비어 있지 않은 동안
				System.out.println("Poll: "+queue.poll());
				System.out.println("Queue: "+queue);
			}
				
	}

}
