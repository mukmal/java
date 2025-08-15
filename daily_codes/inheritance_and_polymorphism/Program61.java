

class Demo {
	int x = 10;
	Demo() {
		this(20);
		System.out.println("In constructor - 1");
		System.out.println(x);
	}
	Demo(int x) {
		System.out.println("In constructor - 2");
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
	}
}

//In constructor - 2
//20
//10
//In constructor - 1
//10
