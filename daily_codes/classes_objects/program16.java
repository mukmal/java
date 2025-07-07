

class One {
	int x=10;
	static int y=20;
	void fun() {
		System.out.println("In fun");
	}
	static void run() {
		System.out.println("In run");
	}
}	
class Two {
	public static void main(String[] args) {
		System.out.println("In main method");
		System.out.println(x);
		System.out.println(y);
		fun();
		run();
	}
}

//program16.java:16: error: cannot find symbol
//          System.out.println(x);
//		               ^
//symbol:   variable x
//location: class Two
//program16.java:17: error: cannot find symbol
//          System.out.println(y);
//                             ^
//symbol:   variable y
//location: class Two
//program16.java:18: error: cannot find symbol
//          fun();
//          ^
//symbol:   method fun()
//location: class Two
//program16.java:19: error: cannot find symbol
//          run();
//          ^
//symbol:   method run()
//location: class Two
//4 errors
