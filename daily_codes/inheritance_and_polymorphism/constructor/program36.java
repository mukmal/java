class Demo {
	Demo(int x) {
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(this);
	}
	public static void main(String[] args) {
		Demo obj = new Demo(20);
		System.out.println(obj);
	}
}

//In constructor
//20
//Demo@7ad041f3
//Demo@7ad041f3
