class ThreadDemo extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 1;i<=10;i++) {
			System.out.println("In fun");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		Thread.sleep(2000);
		for(int i = 1;i<=10;i++) {
			System.out.println("In main");
		}
	}
}
