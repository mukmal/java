

class Parent {
	void marry() {
		System.out.println("Alia Bhat");
	}
}
class Child extends Parent {
	void marry() {
		System.out.println("Disha patni");
	}
}
class Client {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.marry();
	}
}
//Disha patni
