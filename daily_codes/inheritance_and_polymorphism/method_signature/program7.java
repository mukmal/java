class Demo {
	void fun(byte a) {
		System.out.println("In Fun");
	}
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.fun(10);
	}
}

//program7.java:7: error: incompatible types: possible lossy conversion from int to byte
//                obj.fun(10);
//                        ^
//Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//1 error
