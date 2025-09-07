class MyThread extends Thread {
	
}
class Client {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
	}
}
