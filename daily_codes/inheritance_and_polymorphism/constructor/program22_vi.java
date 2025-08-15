class Demo {
	Demo(int x) {
		System.out.println("In constructor");
		return 10;
	}
	void fun() {
		System.out.println("In Fun Method");
	}
}
class ConstrDemo {
	public static void main(String[] args) {
		System.out.println("Start main");
		Demo obj = new Demo(10);
		System.out.println("End Main");
	}
}

//program22_vi.java:4: error: incompatible types: unexpected return value
