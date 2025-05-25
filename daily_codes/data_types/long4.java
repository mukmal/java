class c2w{
	public static void main(String[] args){
		long num1=200005;
		int num2=num1L; 
		System.out.println(num1);			//long4.java:4: error: cannot find symbol
								//                int num2=num1L;
								//                                         ^
								//                                           symbol:   variable num1L
								//                                             location: class c2w
								//                                             1 error       
	}
}
