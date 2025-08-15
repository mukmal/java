
class Demo {
	int x = 10;
	Demo() {
		this(10);
		super();
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
	}
}
//Program60_iv.java:6: error: call to super must be first statement in constructor
//                super();
