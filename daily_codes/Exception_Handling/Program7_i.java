interface Demo {
	void m1();
	default void m2() {
	}
}
class Outer {
	public static void main(String[] args) {
		Demo obj = ()-> {
			System.out.println("Anonymous class");
		};
		obj.m1();	
	}
}
//Anonymous class
