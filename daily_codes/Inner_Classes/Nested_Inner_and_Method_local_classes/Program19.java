class Demo {
	int x = 10;
	Demo (int x) {
		System.out.println(x);
		System.out.println(Demo.this.x);
	}
	public static void main (String[] args) {
		Demo obj = new Demo(20);
	}
}

//20
//10
