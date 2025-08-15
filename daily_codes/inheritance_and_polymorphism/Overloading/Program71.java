

class Demo {
	int fun(int x) {
		System.out.println("int");
	}
	void fun(float x) {
		System.out.println("float");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
	}
}

//Program71.java:6: error: missing return statement
//        }
//        ^
//1 error
