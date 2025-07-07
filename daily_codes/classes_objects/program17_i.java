

class One {
	int x = 10;
	private int y = 20;
	private void fun() {
		System.out.println("In fun");
	}
	void run() {
		System.out.println("In run");
	}
}
class Two {
	public static void main(String[] args) {
		One obj = new One();
		System.out.println(obj.x);	//10
		System.out.println(obj.y);	//20
		obj.fun();		//In fun
		obj.run();		//In run
	}
}

//program17_i.java:17: error: y has private access in One
//                System.out.println(obj.y);      //20
//                                   ^
//program17_i.java:18: error: fun() has private access in One
//                obj.fun();              //In fun
//                ^
//2 errors
