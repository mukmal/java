abstract class Parent {
	void career() {
		System.out.println("Chayachitrakar");
	}
}
class Client {
	public static void main(String[] args) {
		Parent obj = new Parent();	// error: Parent is abstract; cannot be instantiated
	}
}
