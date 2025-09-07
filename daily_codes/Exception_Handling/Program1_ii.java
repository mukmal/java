interface Demo {
	void m1();
	void m2();
}
class DemoChild implements Demo {	
	public void m1() {
	}
	public void m2() {
	}
}
class Client {
	public static void main(String[] args) {
		Demo obj = new DemoChild();
	}
}
//no error
