import java.util.*;
class Demo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.offer(10);
		pq.offer(30);
		pq.offer(40);
		pq.offer(50);
		pq.offer(20);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
//[10, 20, 40, 50, 30]
//10
//10
//20
//[30, 50, 40]
