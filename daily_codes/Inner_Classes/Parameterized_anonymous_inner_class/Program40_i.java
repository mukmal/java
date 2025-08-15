class Demo {
	void fun() {
		System.out.println("In fun-Demo");
	}
			void run() {
				System.out.println("In run-Demo");
			}
}
class Outer {
	public static void main(String[] args) {
		Demo obj3 = new DemoChild() {
			void fun() {
				System.out.println("In fun-Outer$1");
			}
			void run() {
				System.out.println("In run-Outer$1");
			}
		};
		obj3.fun();
		obj3.run();
	}
}

//In fun-Outer$1
//In run-Outer$1
