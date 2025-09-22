import java.util.*;
class Demo {
	public static void main(String[] args) {
		Deque que = new LinkedList();
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		System.out.println(que);
		que.offerFirst(5);
		que.offerLast(50);
		que.pollFirst();
		que.pollLast();
		que.peekFirst();
		que.peekLast();
		System.out.println(que);
	}
}

//[10, 20, 30, 40]
//[10, 20, 30, 40]
