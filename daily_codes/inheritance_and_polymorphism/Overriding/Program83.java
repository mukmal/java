

class Parent {
	private Object fun() {
		return new Object();	
	}
}
class Child extends Parent {
	private String fun() {
		return new String("Hi");
	}
	public static void main(String[] args) {
		Parent p = new Child();
		p.fun();		//Program83.java:14: error: fun() has private access in Parent
	}
}
//
