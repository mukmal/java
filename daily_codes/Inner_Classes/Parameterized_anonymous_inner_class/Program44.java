class Demo {
	void fun(String x) {
		System.out.println("In fun");
	}
}
class Outer {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun("Shashi");
		obj.fun(new String("Shashi"));
	}
}

//In fun
//In fun
