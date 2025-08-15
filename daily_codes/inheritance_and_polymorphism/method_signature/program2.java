class XYZ {
	void fun(int x) {
		System.out.println("In Fun");
		System.out.println(x);
	}
}
class Demo {
	void run(float f) {
		System.out.println("In Run");
		System.out.println(f);
	}
	public static void main(String[] args) {
		XYZ obj1= new XYZ();
		Demo obj2= new Demo();
		obj1.fun();
		obj2.run();
	}
}

//program2.java:15: error: method fun in class XYZ cannot be applied to given types;
//                obj1.fun();
//                       ^
//  required: int
//found:    no arguments
// reason: actual and formal argument lists differ in length
//program2.java:16: error: method run in class Demo cannot be applied to given types;
//		 obj2.run();
//                                                                              ^
//required: float
//found:    no arguments
//reason: actual and formal argument lists differ in length
//2 errors
