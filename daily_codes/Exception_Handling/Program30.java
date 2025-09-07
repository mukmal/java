import java.io.*;
class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Start Main");
		try {
			System.out.println(10/0);
		} catch (RuntimeException re) {
			System.out.println(re);
			System.out.println(re.getMessage());
			re.printStackTrace();
		}
		System.out.println("End Main");
	}
}

//Start Main
//java.lang.ArithmeticException: / by zero
// / by zero
//java.lang.ArithmeticException: / by zero
//        at ExceptionDemo.main(Program30.java:6)
//End Main
