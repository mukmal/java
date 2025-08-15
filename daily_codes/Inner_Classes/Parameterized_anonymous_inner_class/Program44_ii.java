class Demo {
	void fun(Object x) {
		System.out.println("In fun");
	}
}
class Outer {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun("Shashi");
		obj.fun(new StringBuffer("Shashi"));
	}
}
//In fun
//In fun
