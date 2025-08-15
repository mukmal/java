abstract class Parent {
	abstract void career();
	abstract void flat();
	abstract void marry();
}
class Child extends Parent {
	void marry() {
		System.out.println("Komal-G");
	} 
	void career() {};
	void flat() {};
}
class Client {
	public static void main(String[] args) {
		Parent p = new Child();
		p.career();
		p.marry();
	}
}
//no error
