class Demo{
	static int x=10;
	int y=20;
	String str="Mukmal";
	public static void main(String[] args){
		System.out.println(x);
		System.out.println(y);
		System.out.println(str);
	}
}

//program2.java:7: error: non-static variable y cannot be referenced from a static context
//                System.out.println(y);
//                                  ^
//program2.java:8: error: non-static variable str cannot be referenced from a static context
//     System.out.println(str);
//                         ^
//2 errors
