abstract class Parent {
	abstract void career();
	abstract void flat();
	abstract void marry();	
}
class Child extends Parent {		//error: Child is not abstract and does not override abstract method flat() in Parent
	void marry() {
		System.out.println("Komal-G");
	} 
}
class Client {
	public static void main(String[] args) {
		Parent p = new Child();
		p.career();
		p.marry();
	}
}
