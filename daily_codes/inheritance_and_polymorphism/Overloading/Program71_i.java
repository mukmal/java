

class Demo {
	int fun(int x) {
		System.out.println("int");
		return ;
	}
	void fun(float x) {
		System.out.println("float");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
	}
}

//Program71_i.java:6: error: incompatible types: missing return value
//                return ;
//                       ^
//1 error
