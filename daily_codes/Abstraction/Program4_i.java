abstract class Parent {
	void career() {
		System.out.println("Soft. engg");
	}
	public abstract void marry();
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
//Program4_i.java:8: error: marry() in Child cannot override marry() in Parent
//        void marry() {
//             ^
//attempting to assign weaker access privileges; was public
//1 error
