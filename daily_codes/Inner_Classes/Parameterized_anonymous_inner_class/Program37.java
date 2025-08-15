class Demo {
	void fun() {
		System.out.println("In fun-Demo");
	}
}
class DemoChild extends Demo {
	
	void fun() {
		System.out.println("In fun-DemoChild");
	}
}
class Outer {
	public static void main(String[] args) {
		Demo obj1 = new Demo();
		obj1.fun();
		DemoChild obj2 = new DemoChild();
		obj2.fun();
		Demo obj3 = new DemoChild();
		obj3.fun();
	}
}
//In fun-Demo
//In fun-DemoChild
//In fun-DemoChild
