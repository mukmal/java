interface Demo {
	void m1();
	void m2();
}
class Child1 implements Demo {
	public void m1() {
	}
}
//Program11_i.java:5: error: Child1 is not abstract and does not override abstract method m2() in Demo
