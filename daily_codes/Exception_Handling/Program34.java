class Demo {
	public static void main(String[] args) {
		System.out.println("Start code");
		try {
			System.out.println(10/0);
		} finally {
			System.out.println("In finally Block");
		}
		System.out.println("End code");
	}
}

//Start code
//In finally Block
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at Demo.main(Program34.java:5)
