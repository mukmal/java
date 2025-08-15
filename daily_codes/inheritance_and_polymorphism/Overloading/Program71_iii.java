

class Demo {
	int fun(int x) {
		System.out.println("int");
		return 10;
	}
	void fun(float x) {
		System.out.println("float");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
	}
}
//no error
