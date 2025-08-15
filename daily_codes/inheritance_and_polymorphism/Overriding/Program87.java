class Demo {
	int y = 20;
	Demo() {
		System.out.println("Constructor");
		System.out.println(y);
	}
	{
		System.out.println("In instance block");
	}
	void fun() {
		System.out.println("in non-static method");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun();
	}
}

//In instance block
//Constructor
//20
//in non-static method
