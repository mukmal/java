

class Demo {
	static int x = 10;
	static void fun() {
		System.out.println("In fun");
	}
}
	class Client {
		public static void main(String[] args) {
			System.out.println(Demo.x);
			Demo.fun();
		}
	}
//10
//In fun
