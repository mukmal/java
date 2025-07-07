

class Demo {
	static void run(){
		System.out.println("In Run");
	}
	void fun(){
		System.out.println("In Fun");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun();	//In Fun
		run();		//In Run
	}
}
