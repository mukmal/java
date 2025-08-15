class XYZ {
	void fun(int x) {
		System.out.println("In Fun");
		System.out.println(x);
	}
}
class Demo {
	void run(float f) {
		System.out.println("In Run");
		System.out.println(f);
	}
	public static void main(String[] args) {
		XYZ obj1= new XYZ();
		Demo obj2= new Demo();
		obj1.fun(10);
		obj2.run(20.5f);		//if we give only 20.5 then it will give error as incompatible types : possible lossy conversion from double to float
	}
}


//In Fun
//10
//In Run
//20.5
