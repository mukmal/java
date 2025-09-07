interface Demo {
	void m1();
	void m2();
}
class Outer {
	public static void main(String[] args) {
		Demo obj = ()-> {
			System.out.println("Anonymous class");
		};
		obj.m1();	
	}
}
//Program7.java:7: error: incompatible types: Demo is not a functional interface
//                Demo obj = ()-> {
//                           ^
//    multiple non-overriding abstract methods found in interface Demo
//1 error
