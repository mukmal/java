class Demo {
	Demo() {
     		System.out.println("Demo class");
	}
	public void finalize() {
		System.out.println("Object gheun jato re");
	}
}
class Client {
	static void fun() {
		Demo obj = new Demo();
		Demo obj1 = new Demo();
	}
	public static void main(String[] args) {
		System.out.println("Start main");
		fun();
		System.out.println("End main");
	}
}

//Start main
//Demo class
//Demo class
//End main
