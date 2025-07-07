

class Demo {
	void fun() {
		System.out.println("In fun");
	}
	public static void main(String[] args){
		fun();			//to access non-static method we need to create an object as Demo obj = new Demo();
	}
}
//program11.java:8: error: non-static method fun() cannot be referenced from a static context
//                fun();
//                                ^
//                                1 error
