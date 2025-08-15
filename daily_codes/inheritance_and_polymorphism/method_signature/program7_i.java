class Demo {
	void fun(short a) {
		System.out.println("In fun");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun(10);
	}
}

//program7_i.java:7: error: incompatible types: possible lossy conversion from int to short
//                obj.fun(10);
//                        ^
//Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//1 error
