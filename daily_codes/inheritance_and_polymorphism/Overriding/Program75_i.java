

class Parent {
	String marry(String str) {		//Program75_i.java:10: error: marry(String) in Child cannot override marry(String) in Parent
		System.out.println(str);
		return str;
	}
}
class Child extends Parent {
	void marry(String str) {
		System.out.println(str);
	}
}
class Client {
	public static void main(String[] args) {
		Parent p = new Child();
		p.marry("alia bhat");
	}
}
