class Parent {
	void fun() {
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent {
	void run() {
		System.out.println("In run-Child");
	}
}
class Client {
	public static void main(String[] args) {
		Child obj = new Parent();
//		obj.run();
//		obj.fun();
	}
}
//Program4_ii.java:13: error: incompatible types: Parent cannot be converted to Child
//                Child obj = new Parent();
//                ^
//1 error
