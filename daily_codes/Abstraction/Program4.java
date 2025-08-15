abstract class Parent {
	void career() {
		System.out.println("Soft. engg");
	}
	abstract void marry();
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
//Soft. engg
//Komal-G
