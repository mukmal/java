class Demo {
	Demo(int x) {
		System.out.println("In constructor");
	}
	void fun() {
		System.out.println("In Fun Method");
	}
}
class ConstrDemo {
	public static void main(String[] args) {
		System.out.println("Start main");
		Demo obj = new Demo();
		System.out.println("End Main");
	}
}


//program22_i.java:12: error: constructor Demo in class Demo cannot be applied to given types;
//                Demo obj = new Demo();
//                                    ^
//required: int
//found:    no arguments
//reason: actual and formal argument lists differ in length
//1 error
