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
//		obj.fun();
	}
}
//no-error
