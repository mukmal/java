interface Demo {
	void m1();
	void m2();
}
abstract class Child1 implements Demo {
	public void m1() {}
}
class Child2 implements Demo extends Child1 {
	public void m2() {}
}
//Program13_i.java:8: error: '{' expected
//class Child2 implements Demo extends Child1 {
//                            ^
//                            1 error
