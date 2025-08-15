
class Demo {
	int x=10;
	Demo() { 
		System.out.println("In no-args Constructor");
	}
	Demo(int x) {
		System.out.println("In parametarized Constructor");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		Demo obj1 = new Demo(10);
	}
}

//In no-args Constructor
//In parametarized Constructor
