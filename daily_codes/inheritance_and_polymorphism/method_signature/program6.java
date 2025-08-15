class Demo {
	void fun(float f) {
		System.out.println("In fun");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun(10.5f);
		obj.fun('A');
		obj.fun(10);
		obj.fun(50L);
		obj.fun(20.5);
	}
}

//program6.java:11: error: incompatible types: possible lossy conversion from double to float
//                obj.fun(20.5);
//                           ^
//Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//1 error
