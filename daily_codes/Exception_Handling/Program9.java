class Parent {
	static void fun() {
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent {
}
class Client {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.fun();
	}
}
//In fun-Parent
