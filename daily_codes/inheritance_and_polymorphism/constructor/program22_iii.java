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
		Demo obj = new Demo(10.5);
		System.out.println("End Main");
	}
}


//program22_iii.java:12: error: incompatible types: possible lossy conversion from double to int
//             Demo obj = new Demo(10.5);
//                                  ^
//Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//1 error
