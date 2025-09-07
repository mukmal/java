class Parent {
	private void fun() {
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent {
	void fun() {
		System.out.println("In fun-Child");
	}
}
class Client {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.fun();
	}
}
//Program8.java:14: error: fun() has private access in Parent
//                obj.fun();
//                   ^
//1 error
