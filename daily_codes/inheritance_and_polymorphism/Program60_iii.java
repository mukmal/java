
class Demo {
	int x = 10;
	Demo() {
		this();					//Program60_iii.java:4: error: recursive constructor invocation
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
