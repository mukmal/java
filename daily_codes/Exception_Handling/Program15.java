class DefaultHandling {
	static void fun(int x,int y) {
		System.out.println("Start Fun");
		System.out.println(x/y);
		System.out.println("End Fun");
	}
	public static void main(String[] args) {
		 int x = 10;
		 int y = 0;
		 System.out.println("Start Code");
		 fun(x,y);
		 System.out.println("End Code");
	}
}

//Start Code
//Start Fun
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at DefaultHandling.fun(Program15.java:4)
//        at DefaultHandling.main(Program15.java:11)
