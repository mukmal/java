class Demo {
	void fun(short x) {
		System.out.println("In fun");
	}
}
class Outer {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun('A');
	}
}

//error :  incompatible types: possible lossy conversion from char to short
//due to Family 
