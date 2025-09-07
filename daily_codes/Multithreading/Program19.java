class ThreadDemo extends Thread {
	public void run() {
		for(int i =0; i<5; i++) {
			System.out.println("In run");
			try {
				join();
			} catch (Exception ie) {
				
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		Thread.currentThread().join();
		for(int i = 0; i<10; i++) {
			System.out.println("In main");
		join();		//error: non-static method join() cannot be referenced from a static context
		}
	}
}
