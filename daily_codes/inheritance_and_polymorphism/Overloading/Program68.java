

class Demo {
	void fun(int x) {
		System.out.println("fun-int");
	}
	void fun(char x) {
		System.out.println("fun-char");
	}
	void fun(float x) {
		System.out.println("fun-float");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun(10);
		obj.fun('A');
		obj.fun(10.5f);		//if we write only 10.5 then java implicitly consider as double so it will give error as incompatible types
	}
}

//fun-int
//fun-char
//fun-float
