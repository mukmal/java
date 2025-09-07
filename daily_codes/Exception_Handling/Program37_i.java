class Demo {
	public static void main(String[] args) {
		System.out.println("start code");
		throw new ArithmeticException("Division by zero");
//		System.out.println("End code");
	}
}

//start code
//Exception in thread "main" java.lang.ArithmeticException: Division by zero
//        at Demo.main(Program37_i.java:4)
