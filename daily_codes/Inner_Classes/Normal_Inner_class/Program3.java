class Parent {
	void fun() {
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent {
	void fun() {
		System.out.println("In fun-Child");
		super.fun();
	}
}
class Client {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.fun();
	}
}

//In fun-Child
//In fun-Parent
