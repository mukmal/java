

class Parent {
	final Object fun() {
		return new Object();
	}
}
class Child extends Parent {
	String fun() {
		return new String("Hi");
	}
	public static void main(String[] args) {
		Parent p = new Child();
		p.fun();
	}
}
//Program85.java:9: error: fun() in Child cannot override fun() in Parent
//        String fun() {
//               ^
//overridden method is final
//1 error
