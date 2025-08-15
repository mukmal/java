interface Demo {
	void m1();
	void m2();
}
abstract class Child1 implements Demo {
	public void m1() {}
}
class Child2 implements Child1{
	public void m2() {}
}
//Program12_i.java:8: error: interface expected here
//class Child2 implements Child1{
//                        ^
//                        1 error
