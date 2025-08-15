

class Outer {
	static int x = 10;
	int y = 20;
	void fun() {
		System.out.println("In fun");
	}
	static void run() {
		System.out.println("In static method");
	}
	
	static class Inner {
		Inner() {
			System.out.println(x);
			System.out.println(y);		//non-static variable y cannot be referenced from a static context
			run();			
			fun();				//non-static method fun() cannot be referenced from a static context
		}
	}

	public static void main(String[] args) {
		Inner obj = new Inner();
	}
}
