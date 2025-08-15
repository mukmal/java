

class Outer {
	static int x = 10;
	int y = 20;
	void fun() {
		System.out.println("In fun");
	}
	static void run() {
		System.out.println("In static method");
	}
	
	static class Inner {
		Inner() {
			System.out.println(x);
			//System.out.println(y);
			run();
			//fun();
		}
	}
}
class Client {
	public static void main(String[] args) {
		Outer.Inner obj = new Outer.Inner();
	}
}
//10
//In static method
