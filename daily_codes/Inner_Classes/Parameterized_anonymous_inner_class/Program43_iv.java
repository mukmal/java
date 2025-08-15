class Demo {
	void fun(int x) {
		System.out.println("In fun");
	}
}
class Outer {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun(10L);
	}
}
//error: incompatible types: possible lossy conversion from long to int
