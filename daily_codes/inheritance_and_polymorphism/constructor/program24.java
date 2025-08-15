class Demo {
	int x = 10;
	int y = 20;
	Demo(int a,int b) {
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(y);
		x = a;
		y = b;
	}
	void printDemo() {
		System.out.println(x);
		System.out.println(y);
	}
}
class ConstrDemo {
	public static void main(String[] args) {
		Demo obj=new Demo(30,40);
		obj.printDemo();
	}
}

//In constructor
//10
//20
//30
//40
