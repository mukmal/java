class ThreadDemo implements Runnable {
	public void run() {
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}
class Client {
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		Thread t1 = new Thread(td);
		t1.start();
		System.out.println(Thread.currentThread().getName());	
	}
}
//main
//In run
//Thread-0
