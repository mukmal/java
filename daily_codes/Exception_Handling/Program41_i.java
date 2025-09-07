class Demo extends RuntimeException {
	Demo(String str) {
		super(str);
	}
}
class Client {
	static void fun() {
		throw new Demo("Hello from Demo");
	}
	public static void main(String[] args) {
		fun();
	}
}

//Exception in thread "main" Demo: Hello from Demo
  //      at Client.fun(Program41_i.java:8)
//        at Client.main(Program41_i.java:11)
