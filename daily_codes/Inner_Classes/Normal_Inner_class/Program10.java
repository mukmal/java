class Outer {
	int x = 10;
	void fun() {
		System.out.println("In fun-outer");
	}
	class Inner {
		Inner() {
		}
	}
	void run() {
		System.out.println("In run-outer");
	}
}
class Client {
	public static void main(String[] args) {
		Outer obj = new Outer();
		System.out.println(obj.x);
		obj.fun();
		obj.run();
	}
}

//10
//In fun-outer
//In run-outer
