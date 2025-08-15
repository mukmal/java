class Demo {
	void fun() {
		System.out.println("In fun");
	}
}
class Outer {
	public static void main(String[] args) {
		Demo obj = new Demo(){};
		Demo obj1 = new Demo(){};
		obj.fun();
	}
}

// Demo.class  'Outer$1.class'  'Outer$2.class'   Outer.class
