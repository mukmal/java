class Demo{
	int x=10;
	static int y=20;
	public static void main(String[] args){
		System.out.println(x);
		System.out.println(y);
	}
}
//static_variable_err.java:5: error: non-static variable x cannot be referenced from a static context
//                System.out.println(x);
//                                                   ^
//                                                   1 error
