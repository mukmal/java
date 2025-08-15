class Demo {
	void fun(byte a) {
		System.out.println("In fun");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun('A');
	}
}


//program7_ii.java:7: error: incompatible types: possible lossy conversion from char to byte
//                obj.fun('A');
//                         ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//1 error
