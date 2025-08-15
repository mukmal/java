

class Demo {
	void fun(int x,float y) {
		System.out.println("int - float");
	}
	void fun(float x,int y) {
		System.out.println("float - int");
	}
/*	void fun(float x,float y) {
		System.out.println("float - float");
	}*/
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun(10.5f,20.5f);
	}
}
//Program70_i.java:15: error: no suitable method found for fun(float,float)
//                obj.fun(10.5f,20.5f);
//                                   ^
// method Demo.fun(int,float) is not applicable
//(argument mismatch; possible lossy conversion from float to int)
// method Demo.fun(float,int) is not applicable
//(argument mismatch; possible lossy conversion from float to int)
//1 error
