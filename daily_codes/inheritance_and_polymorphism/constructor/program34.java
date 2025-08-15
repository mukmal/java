class Demo {
	Demo(int x) {
		System.out.println("In constructor");
		System.out.println(x);
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
	}
}



//program34.java:7: error: constructor Demo in class Demo cannot be applied to given types;
//                Demo obj = new Demo();
//                                   ^
//required: int
//found:    no arguments
//reason: actual and formal argument lists differ in length
//1 error
