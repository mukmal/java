class Demo extends RuntimeException {
}
class Client {
	static void fun() {
		throw new Demo();
	}
	public static void main(String[] args) {
		fun();
	}
}

//Exception in thread "main" Demo
  //      at Client.fun(Program41.java:5)
//        at Client.main(Program41.java:8)
