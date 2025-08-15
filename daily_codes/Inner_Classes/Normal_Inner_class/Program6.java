class Parent {
	void fun() {
		System.out.println("In fun-Parent");
	}
	void run() {
		System.out.println("In run-Parent");
	}
	void gun() {
		System.out.println("In gun-Parent");
	}
}
class Child extends Parent {
	void fun() {
		System.out.println("In fun-Child");
	}
	void gun() {
		System.out.println("In gun-Child");
	}
}
class Client {
	public static void main(String[] args) {
		Parent p = new Child();
		p.fun();
		p.gun();
	}
}

//In fun-Child
//In gun-Child
