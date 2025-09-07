class Parent {
	static void fun() {						//use final keyword : same error
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
	}
}
//Program10.java:7: error: fun() in Child cannot override fun() in Parent
//        void fun() {
//             ^
//  overridden method is static
//1 error
