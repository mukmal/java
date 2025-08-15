class Parent {
	int x = 20;
	Parent() {
		System.out.println("In Parent Constructor");
	}
	void fun() {
		System.out.println("In fun-Parent");
	}
}
class Child extends Parent {
	int x = 10;
	Child() {
		System.out.println("In Child Constructor");
	}
	void fun() {
		System.out.println("In fun-Child");
	}
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.x);
		obj.fun();
	}
}

//In Parent Constructor
//In Child Constructor
//10
//In fun-Child
