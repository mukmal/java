

class Demo {
}
class Parent {
	public Object fun() {
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

//Program80.java:14: error: fun() in Child cannot override fun() in Parent
//     String fun() {
//               ^
//attempting to assign weaker access privileges; was public
//1 error
