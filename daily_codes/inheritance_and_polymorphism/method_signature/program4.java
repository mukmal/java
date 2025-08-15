class Demo {
	void fun (char x,char y) {
		System.out.println("In fun");
		System.out.println(x);
		System.out.println(y);
	}
	void run(double a, float b) {
		System.out.println("In run");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Demo obj = new Demo();

		obj.fun('A','B');
		obj.fun(65,66);

		obj.run('R','S');
		obj.run(10,20);
		obj.run(10.5,20.5);

		obj.run(10.5f,20);
		obj.run(10.5f,20.5f);
		obj.run(10.5,20.5f);
	}
}

//program4.java:16: error: incompatible types: possible lossy conversion from int to char
//                obj.fun(65,66);
//                        ^
//program4.java:20: error: incompatible types: possible lossy conversion from double to float
//                obj.run(10.5,20.5);
//                            ^
//Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//2 errors
