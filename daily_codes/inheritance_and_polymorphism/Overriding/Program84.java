

class Parent {
	protected Object fun() {
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

//Program84.java:9: error: fun() in Child cannot override fun() in Parent
//        String fun() {
//               ^
//attempting to assign weaker access privileges; was protected
//1 error
