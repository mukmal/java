class ThreadException extends Thread {
	public void run() {
		int a[] = {1,2,4};
		System.out.println("In run");
		System.out.println(a[4]);
	}
}
class Client {
	public static void main(String[] args) {
		ThreadException t1 = new ThreadException();
		t1.start();
		System.out.println(10/0);
	}
}
//In run
//Exception in thread "main" Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero
//        at Client.main(Program16.java:12)
//java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
//        at ThreadException.run(Program16.java:5)
