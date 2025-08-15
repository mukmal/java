

class Demo {
	int fun(int x) {
		System.out.println("int");
		return 10;
	}
	float fun(int x) {			//Program72.java:8: error: method fun(int) is already defined in class Demo
		System.out.println("float");
		return 10.5f;
	}
	public static void main(String[] args) {
		Demo obj = new Demo();	
	}
}
