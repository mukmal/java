

class Demo {
	int x = 10;
	Demo(int x) {
		System.out.println("In Constructor");
		System.out.println(x);
		System.out.println(this.x);
	}
	void fun() {
		System.out.println(x);
	}
	public static void main(String[] args) {
		Demo obj = new Demo(20);
		obj.fun();
	}
}

//In Constructor 
//20 
//10
//10
