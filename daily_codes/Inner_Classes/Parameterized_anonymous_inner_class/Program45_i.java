class Parent {
}
class Child extends Parent {
}
class Demo {
	void fun(Child obj) { 		//incompatible types: Parent cannot be converted to Child
		System.out.println("In fun");
	}
}
class Outer {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun(new Parent());
		obj.fun(new Child());
	}
}

