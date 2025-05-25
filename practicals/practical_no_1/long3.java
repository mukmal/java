class c2w{
	public static void main(String[] args){
		long num1=200005;
		int num2=num1;
		System.out.println(num1);		//long3.java:4: error: incompatible types: possible lossy conversion from long to int
							//                int num2=num1;
							//                                         ^
							//                                         1 error
	}
}
