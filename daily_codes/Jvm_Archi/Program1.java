class Demo {
	int x = 10;
	static int y = 20;
	static {
		System.out.println("In static block");
	}
	void fun() {
		System.out.println("In Non-static method");
	}
	static void run() {
		System.out.println("static method");
	}
}
class DemoChild extends Demo {
	DemoChild() {
		System.out.println("In DemoChild Constructor");
	}
}
class Client {
	static {
		System.out.println("In static-client");
	}
	public static void main(String[] args) {
		System.out.println("In main");
		System.out.println(Demo.y);
	/*	obj.fun();
		obj.run();
		DemoChild obj2 = new DemoChild();
	*/}
}

//In static-client
//In main
//In static block
//20
