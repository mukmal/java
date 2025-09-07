import java.io.*;
class Demo {
	static throws InterruptedException {
		//System.out.println("In constructor");
		Thread.sleep(3000);
		//System.out.println("End constructor");
	}
	public static void main(String[] args) throws Exception {
		System.out.println("Start main");
		Demo obj = new Demo();
		Thread.sleep(5000);
		System.out.println("End main");
	}
}
//Program36_i.java:3: error: illegal start of type
//        static throws InterruptedException {
//               ^
//Program36_i.java:3: error: <identifier> expected
//        static throws InterruptedException {
//                                          ^
//2 errors
