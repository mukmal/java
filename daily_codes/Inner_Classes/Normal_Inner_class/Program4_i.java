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
		Parent obj = new Child();
//		obj.run();	cause error
		obj.fun();
	}
}

//In fun-Parent
