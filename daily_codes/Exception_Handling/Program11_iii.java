class Parent {
	static int x = 10;
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
		Parent obj1 = new Parent();
		obj1.fun();
		Child obj2 = new Child();
		obj2.fun();
		Parent obj3= new Child();
		obj3.fun();
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		System.out.println(obj3.x);
	}
}
//In fun-Parent
//In fun-Child
//In fun-Parent
//10
//10
//10
