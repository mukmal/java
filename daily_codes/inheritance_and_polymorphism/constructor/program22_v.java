class Demo {
	Demo(int x) {
		System.out.println("In constructor");
	}
	void fun() {
		System.out.println("In Fun Method");
	}
}
class ConstrDemo {
	public static void main(String[] args) {
		System.out.println("Start main");
		Demo obj = new Demo(10.5f);
		System.out.println("End Main");
	}
}


//program22_v.java:12: error: incompatible types: possible lossy conversion from float to int
