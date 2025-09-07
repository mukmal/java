class ThreadName extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(getName());
	}
}
class Client {
	public static void main(String[] args) {
		ThreadName obj = new ThreadName();
		obj.start();
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
	}
}
//Thread[Thread-0,5,main]
//Thread-0
//Thread-0
//Thread[main,5,main]
//main
