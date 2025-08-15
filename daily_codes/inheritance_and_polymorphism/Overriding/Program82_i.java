

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
	private String fun() {
		return new String("Hi");
	}
	public Demo run() {
		return new Demo();
	}
}
//no error
