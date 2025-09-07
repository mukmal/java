class NullDemo {
	void fun() {
		System.out.println("In fun");
	}
	void gun() {
		System.out.println("In gun");
	}
}
class Client {
	public static void main(String[] args) {
		NullDemo obj = new NullDemo();
		obj.fun();
		obj=null;
		obj.gun();
	}
}

//In fun
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "NullDemo.gun()" because "<local1>" is null
//        at Client.main(Program21.java:14)
