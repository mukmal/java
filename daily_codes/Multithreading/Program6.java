class ThreadDemo extends Thread {
	public void run() {	
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}
