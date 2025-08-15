

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
		static int x = 50;
		Inner() {
			System.out.println(x);
			System.out.println(Outer.x);
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

//50
//10
//In static method
