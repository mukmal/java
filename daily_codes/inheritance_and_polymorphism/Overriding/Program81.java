

class Demo {
}
class Parent {
	Object fun() {
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
	Demo run() {
		return new Demo();
	}
}
class Cilent {
	public static void main(String[] args) {
	}
 }
//no error
