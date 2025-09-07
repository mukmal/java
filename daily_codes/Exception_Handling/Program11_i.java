class Parent {
	static void fun() {
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent {
	static void fun() {
		System.out.println("In fun-Child");
	}
}
class Client {
	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.fun();
		Child obj1 = new Child();
		obj1.fun();
	}
}
//In fun-Parent
//In fun-Child
