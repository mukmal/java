class Demo {
			void fun() {
				System.out.println("In run-Demo");
			}
	
}
class Outer {
	public static void main(String[] args) {
		new DemoChild() {
			void run() {
				System.out.println("In run-Outer$1");
			}
		}.run();
	}
}

//In run-Outer$1
