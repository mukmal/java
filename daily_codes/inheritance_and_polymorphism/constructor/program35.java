class Demo {
	Demo(int x) {
		System.out.println("In constructor");
		System.out.println(x);
	}
	public static void main(String[] args) {
		Demo obj = new Demo(20);
	}
}
//In constructor 
//20
