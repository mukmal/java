

class Demo {
	int x;
	Demo(int x) {
		this.x=x;
		System.out.println("In Constructor");
	}
	void fun() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		Demo obj1 = new Demo(120);
		Demo obj2 = new Demo(150);
		obj1.fun();
		obj2.fun();
	}
}

//In Constructor
//In Constructor
//120
//150
