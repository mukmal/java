class Demo {
	public static void main(String[] args) {
		System.out.println("start code");
		throw new ArithmeticException("Division by zero");
		System.out.println("End code");		//error: unreachable statement
	}
}
