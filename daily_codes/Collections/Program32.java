import java.util.*;
class Demo {
	public static void main(String[] args) {
		Queue que = new LinkedList();
		que.offer(10);
		que.offer(20);
		que.offer(50);
		que.offer(40);
		que.offer(30);
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.element());
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que.remove());
		System.out.println(que);
	}
}

//[10, 20, 50, 40, 30]
//10
//10
//[10, 20, 50, 40, 30]
//10
//20
//[50, 40, 30]
