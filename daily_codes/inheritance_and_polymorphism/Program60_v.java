
class Demo {
	int x = 10;
	Demo() {
		this(10);
		System.out.println("In no-args ");
	}
	Demo(int x) {
		this(10,20);
		System.out.println("In parameter-1");
	}
	Demo(int y,int z) {
		System.out.println("In parameter-2");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
	}
}

//In parameter-2
//In parameter-1
//In no-args
