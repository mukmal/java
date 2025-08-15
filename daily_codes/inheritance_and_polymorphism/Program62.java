

class Demo {
	int x = 10;
	int y = 20;
	Demo() {
		this(30,40);
		System.out.println("Constructor - 1");
		System.out.println(this);
	}
	Demo(int x) {
		System.out.println("Constructor - 2");
	}
	Demo(int x,int y) {
		System.out.println("Constructor - 3");
	}
	public static void main(String[] args) {
		//new Demo();
		System.out.println(new Demo());
	}
}

//Constructor - 3
//Constructor - 1
//Demo@7ad041f3
//Demo@7ad041f3
