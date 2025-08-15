class Outer {
	static int x = 10;
	static void run() {
		System.out.println("In static method");
	}
	class Inner {
		int y = 20;
		void fun() {
			System.out.println("In fun method");
			System.out.println(x);
			run();
		}
	}
	public static void main(String[] args) {
		Outer outObj = new Outer();
		Inner obj = outObj.new Inner();
		System.out.println(obj.y);
		obj.fun();
	}
}

//20
//In fun method
//10
//In static method
