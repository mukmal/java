interface Demo {
	void m1();
}
class Outer {
	public static void main(String[] args) {
		Demo obj = new Demo() {
			public void m1() {
				System.out.println("In fun-Outer$1");
			}
		};
		obj.m1();
	}
}
//In fun-Outer$1
