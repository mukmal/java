class Parent {
	void career() {
		System.out.println("Soft. engg");
	}
	void marry();		//error: missing method body, or declare abstract
}
class Child extends Parent {
	void marry() {
		System.out.println("Komal-G");
	}
}
class Client {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.career();
		obj.marry();
	}
}
