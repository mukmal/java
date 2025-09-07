import java.io.*;
class Demo {
	Demo() throws InterruptedException {
		System.out.println("In constructor");
		Thread.sleep(3000);
		System.out.println("End constructor");
	}
	public static void main(String[] args) throws Exception {
		System.out.println("Start main");
		Demo obj = new Demo();
		Thread.sleep(5000);
		System.out.println("End main");
	}
}
//Start main
//In constructor
//End constructor
//End main
