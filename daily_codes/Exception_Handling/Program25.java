import java.io.*;
class Demo {
	void fun() throws InterruptedException , IOException , ArithmeticException {
		System.out.println("In fun");
	}
	public static void main(String[] args) throws InterruptedException , IOException {
		Demo obj = new Demo();
		obj.fun();
	}
}
//no error
