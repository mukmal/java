import java.util.concurrent.*;
class ThreadTask implements Runnable {
	int num = 0;
	ThreadTask(int num) {
		this.num = num;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start - "+num);
		fun();
		System.out.println(Thread.currentThread().getName()+" end - "+num);
	}
	void fun() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			
		}
	}
}
class ThreadPoolDemo {
	public static void main(String[] args) {
		ThreadPoolExecutor threadPool = (ThreadPoolExecutor)Executors.newCachedThreadPool();
		for(int i = 1; i<=10; i++){
			ThreadTask task = new ThreadTask(i);
			threadPool.execute(task);
		}
		threadPool.shutdown();
	}
}
//pool-1-thread-10 Start - 10
//pool-1-thread-7 Start - 7
//pool-1-thread-3 Start - 3
//pool-1-thread-5 Start - 5
//pool-1-thread-2 Start - 2
//pool-1-thread-6 Start - 6
//pool-1-thread-4 Start - 4
//pool-1-thread-9 Start - 9
//pool-1-thread-1 Start - 1
//pool-1-thread-8 Start - 8
//pool-1-thread-7 end - 7
//pool-1-thread-5 end - 5
//pool-1-thread-3 end - 3
//pool-1-thread-2 end - 2
//pool-1-thread-4 end - 4
//pool-1-thread-6 end - 6
//pool-1-thread-10 end - 10
//pool-1-thread-9 end - 9
//pool-1-thread-1 end - 1
//pool-1-thread-8 end - 8
