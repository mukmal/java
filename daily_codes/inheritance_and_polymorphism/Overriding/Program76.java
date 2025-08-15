

class Parent {
	int marry(String str) {
		System.out.println(str);
		return 10;
	}
}
class Child extends Parent {
	float marry(String str) {			//Program76.java:10: error: marry(String) in Child cannot override marry(String) in Parent
		System.out.println(str);
		return 10.5f;
	}
}
class Client {
	public static void main(String[] args) {
		Parent p = new Child();
		p.marry("Hi");
	}
}
