interface Demo {
	void m1();
	void m2();
}
class DemoChild implements Demo {	// DemoChild is not abstract and does not override abstract method m2() in Demo
}
class Client {
	public static void main(String[] args) {
	}
}
