class Parent {
	final void fun() {
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

//Program8_ii.java:7: error: fun() in Child cannot override fun() in Parent
//        void fun() {
//             ^
//  overridden method is final
//1 error
