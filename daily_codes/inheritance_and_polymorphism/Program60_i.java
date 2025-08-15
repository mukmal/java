
class Demo {
	int x = 10;
	Demo() {
		System.out.println("In no-args ");
	}
	Demo(int x) {
		System.out.println("In parameter-1");
	}
	Demo(int y,int z) {
		System.out.println("In parameter-2");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		Demo obj1 = new Demo(10);
		Demo obj2 = new Demo(10,20);
	}
}

//In no-args
//In parameter-1
//In parameter-2
