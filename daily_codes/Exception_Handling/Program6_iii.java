interface Demo {
	void m1();
}
class Outer {
	public static void main(String[] args) {
		Demo obj = m1()-> System.out.println("In fun-Outer$1");
		obj.m1();
	}
}
//Program6_iii.java:6: error: ';' expected
//                Demo obj = m1()-> System.out.println("In fun-Outer$1");
//                               ^
//1 error
