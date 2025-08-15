

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
		obj.fun(10,20);
	}
}

//Program70_ii.java:15: error: reference to fun is ambiguous
//            obj.fun(10,20);
//                    ^
//both method fun(int,float) in Demo and method fun(float,int) in Demo match
//1 error
