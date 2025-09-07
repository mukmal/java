class ThreadDemo extends Thread {
	public void run() {
		System.out.println(getPriority());
		System.out.println(Thread.currentThread().getName());
	}
}
class Client {
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		ThreadDemo t1 = new ThreadDemo();
		t1.getPriority();
		t1.setPriority(11);
		t1.start();	
	}
}

//main
//Exception in thread "main" java.lang.IllegalArgumentException
