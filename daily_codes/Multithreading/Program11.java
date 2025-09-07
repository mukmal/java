class ThreadDemo extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("In run-ThreadDemo");
		}
	}
}
class MyThread extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("In run-MyThread");
		}
	}
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
	}
}

//output varry
