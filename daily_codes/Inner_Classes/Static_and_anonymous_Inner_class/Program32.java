

class Outer {
	static int x = 10;
	int y = 20;
	void fun() {
		System.out.println("In fun");
	}
	static void run() {
		System.out.println("In static method");
	}
	
	public static void main(String[] args) {
		Outer obj = new Outer();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.run();
		obj.fun();
	}
}
//10
//20
//In static method
//In fun
