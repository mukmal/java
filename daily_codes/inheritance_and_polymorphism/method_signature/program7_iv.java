class Demo {
	void fun(float x) {
		System.out.println("In fun");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun(true);		//incompatible types: boolean cannot be converted to float
	}
}

//boolean cannot convert to any other family
