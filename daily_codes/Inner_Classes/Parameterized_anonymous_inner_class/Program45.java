class Parent {
}
class Child extends Parent {
	void fun(Parent obj) {
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
//In fun
//In fun
