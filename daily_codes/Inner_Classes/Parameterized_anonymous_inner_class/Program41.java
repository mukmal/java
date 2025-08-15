class Demo {
			void fun() {
				System.out.println("In run-Demo");
			}
	
}
class Outer {
	public static void main(String[] args) {
		Demo obj3 = new DemoChild() {
			void run() {
				System.out.println("In run-Outer$1");
			}
		};
		obj3.fun();
	}
}

//In fun-DemoChild
