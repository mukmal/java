

class Demo {
}
class Parent {
	private Object fun() {
		return new Object();	
	}
	Object run() {
		return new Object();
	}
}
class Child extends Parent {
	String fun() {
		return new String("Hi");
	}
	public Demo run() {
		return new Demo();
	}
}
//no error
