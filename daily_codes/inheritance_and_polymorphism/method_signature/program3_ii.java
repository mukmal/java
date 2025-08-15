class XYZ {
	void gun() {
		System.out.println("In gun");
	}
	void fun(int x) {
		System.out.println("In fun");
		System.out.println(x);
	}
}
class Demo {
	void run(int i,float f) {
		System.out.println("In run");
		System.out.println(i);
		System.out.println(f);
	}
	public static void main(String[] args){
		XYZ obj1 = new XYZ();
		Demo obj2 = new Demo();
		obj1.gun();
		obj1.fun(10);
		obj2.run(50);
	}
}
//program3_ii.java:21: error: method run in class Demo cannot be applied to given types;
//                obj2.run(50);
//                                    ^
// required: int,float
// found:    int
// reason: actual and formal argument lists differ in length
// 1 error
