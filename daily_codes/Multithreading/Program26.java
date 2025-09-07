class ThreadDemo extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon");
		} else {
			System.out.println("Normal");			
		}
	}
}
class Client {
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		t2.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}

//Normal
//Normal
//Daemon
