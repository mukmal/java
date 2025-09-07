import java.io.*;
class MyException extends Exception {
	MyException(String str) {
		super(str);
	}
}
class Demo {
	public static void main(String[] args) {
		try {
			throw new MyException("Swatahache Exception");
		} catch(MyException me) {
			me.printStackTrace();
		}
	}
}

//MyException: Swatahache Exception
//        at Demo.main(Program46.java:10)
