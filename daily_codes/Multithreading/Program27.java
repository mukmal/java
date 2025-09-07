class ThreadDemo extends Thread {
	ThreadDemo(ThreadGroup tg,String str ) {
		super(tg,str);
	}
	public void run() {
		System.out.println(Thread.currentThread());
	}
}
class Client {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		ThreadGroup tg = new ThreadGroup("Instagram");
		ThreadGroup subtg1 = new ThreadGroup(tg,"Reels");
		ThreadGroup subtg2 = new ThreadGroup(tg,"Post");
		ThreadDemo t1 = new ThreadDemo(subtg1,"Shashi");
		ThreadDemo t2 = new ThreadDemo(subtg1,"Ashish");
		ThreadDemo t3 = new ThreadDemo(subtg2,"Kanha");
		ThreadDemo t4 = new ThreadDemo(subtg2,"Rahul");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(tg.getParent().getName());
		System.out.println(tg.activeCount());
		System.out.println(subtg1.getParent().getName());
		System.out.println(subtg1.activeCount());
	}
}
