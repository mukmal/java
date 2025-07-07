

class Demo {
	static void run(){
		System.out.println("In Run");
	}
	void fun(){
		System.out.println("In Fun");
	}
	public static void main(String[] args){
		fun();
	}
}
//program7.java:11: error: non-static method fun() cannot be referenced from a static context
//                fun();
//                                ^
//                                1 error
