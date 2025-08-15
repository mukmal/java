class Demo {
	Demo() {
		System.out.println("In constructor");
	}
	void fun() {
		System.out.println("In Fun Method");
	}
}
class ConstrDemo {
	public static void main(String[] args) {
		System.out.println("Start main");
		Demo obj = new Demo();
		System.out.println("End Main");
	}
}


//Start main
//In constructor
//End Main
