

class Demo {
	void fun(int x,int y) {
		System.out.println("int - int");
	}
	void fun(int x,float y) {
		System.out.println("int - float");
	}
	void fun(float x,int y) {
		System.out.println("float - int");
	}
	void fun(float x,float y) {
		System.out.println("float - float");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun(10,20);
		obj.fun(10,20.5f);
		obj.fun(10.5f,20);
		obj.fun(10.5f,20.5f);
		obj.fun(10.5,20.5);
	}
}

//Program69_i.java:22: error: no suitable method found for fun(double,double)
//                obj.fun(10.5,20.5);
//                                   ^
//method Demo.fun(int,int) is not applicable
//(argument mismatch; possible lossy conversion from double to int)
//method Demo.fun(int,float) is not applicable
//(argument mismatch; possible lossy conversion from double to int)
//method Demo.fun(float,int) is not applicable
//(argument mismatch; possible lossy conversion from double to float)
//method Demo.fun(float,float) is not applicable
//(argument mismatch; possible lossy conversion from double to float)
//1 error
