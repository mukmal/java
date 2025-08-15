class Demo {
	static int x = 10;
	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}
	static void run() {
		System.out.println("In static method");
	}
	public static void main(String[] args) {
		System.out.println("In main");
		run();
	}
}

//static block 1
//static block 2 
//static block 3
//In main
//In static method
