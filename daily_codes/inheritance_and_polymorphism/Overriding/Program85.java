class Demo {
	static int x = 10;
	static {
		System.out.println("static block");
	}
	static void run() {
		System.out.println("In static method");
	}
	public static void main(String[] args) {
		System.out.println("In main");
		run();
	}
}

//static block
//In main
//In static method
