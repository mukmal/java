import java.util.concurrent.*;
class Demo {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue bq = new PriorityBlockingQueue(3);
		bq.put(10);
		bq.put(20);
		bq.put(30);
		System.out.println(bq);
		bq.put(40);
		bq.take();
		System.out.println(bq);
	}
}
//[10, 20, 30]
//[20, 40, 30]
