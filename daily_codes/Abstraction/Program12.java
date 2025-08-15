interface Demo {
	void m1();
	void m2();
}
abstract class Child1 implements Demo {
	public void m2() {}
}
//no-error
