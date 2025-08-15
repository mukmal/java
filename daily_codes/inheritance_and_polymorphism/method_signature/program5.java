class Demo {
	void fun(long x,double y) {
		System.out.println("In fun");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();

		obj.fun('A','B');
		obj.fun(10,10.5);
		obj.fun(10,20.5f);
		obj.fun(10.5f,20.5);
		obj.fun(20.5,10.5f);
		obj.fun(20l,10.5);
	}
}

//program5.java:11: error: incompatible types: possible lossy conversion from float to long
//                obj.fun(10.5f,20.5);
//.java:12: error: incompatible types: possible lossy conversion from double to long
//                obj.fun(20.5,10.5f);
//                         ^
//Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//2 errors
