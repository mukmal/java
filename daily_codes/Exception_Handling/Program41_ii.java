class Demo extends RuntimeException {
	Demo(String str) {
		super(str);
	}
}
class Client {
	static void fun() {
		try {
			throw new Demo("Hello from Demo");
		} catch(Demo e) {
			e.printStackTrace();
//			System.out.println(e);				Demo : Hello from Demo
		}
	}
	public static void main(String[] args) {
		fun();
	}
}

//Hello from Demo
  //      at Client.fun(Program41_i.java:9)
//        at Client.main(Program41_i.java:15)
