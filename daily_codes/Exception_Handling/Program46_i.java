import java.io.*;
class MyException extends Exception {
	MyException(String str) {
		super(str);
	}
}
class Demo {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch(ArithmeticException me) {
			me.printStackTrace();
			throw new ArithmeticException("Divide by zero");
		}
	}
}
//java.lang.ArithmeticException: / by zero
//        at Demo.main(Program46_i.java:10)
//Exception in thread "main" java.lang.ArithmeticException: Divide by zero
//        at Demo.main(Program46_i.java:13)
