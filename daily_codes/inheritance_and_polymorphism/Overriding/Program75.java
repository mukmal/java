

class Parent {
	void marry(String str) {
		System.out.println(str);
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
//alia bhat
