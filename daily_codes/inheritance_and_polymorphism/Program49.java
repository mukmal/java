class Parent {
	int x = 10;
	static int y = 20;
	Parent() {
		System.out.println("Parent Constructor");
	}
	void fun() {
		System.out.println("In fun");
	}
	static void run() {
		System.out.println("In run");
	}
}
class Child extends Parent {
	Child() {
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.x);
		System.out.println(y);		//also obj.y
		obj.fun();
		run();				//also obj.run()
	}
}

//Parent Constructor
//Child Constructor
//10
//20
//In fun
//In run
