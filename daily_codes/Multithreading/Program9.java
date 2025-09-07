class Demo {
	static {
		System.out.println(10/0);
	}
	public static void main(String[] args) {}
}
//Exception in thread "main" java.lang.ExceptionInInitializerError
//Caused by: java.lang.ArithmeticException: / by zero
//        at Demo.<clinit>(Program9.java:3)
