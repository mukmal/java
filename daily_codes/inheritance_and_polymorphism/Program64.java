

class Demo {
	int x = 10;
	Demo(int x) {
		System.out.println("In Constructor");
	}
	void fun() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		new Demo();
	}
}
//Program64.java:12: error: constructor Demo in class Demo cannot be applied to given types;
//                new Demo();
// 	                   ^
//required: int
//found:    no arguments
//reason: actual and formal argument lists differ in length
//1 error
