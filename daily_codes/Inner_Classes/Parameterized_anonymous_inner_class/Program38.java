class Demo {
	void fun() {
		System.out.println("In fun-Demo");
	}
}
class DemoChild extends Demo {
	void fun() {
		System.out.println("In fun-DemoChild");
	}
	void run() {
		System.out.println("In run-DemoChild");
	}
}
class Outer {
	public static void main(String[] args) {
		Demo obj1 = new Demo();
		obj1.fun();
		obj1.run();			//error: cannot find symbol
		DemoChild obj2 = new DemoChild();
		obj2.fun();
		obj2.run();
		Demo obj3 = new DemoChild();
		obj3.fun();
		obj3.run();			//error: cannot find symbol
	}
}
