class c2w{
	public static void main(String[] args){
		double num1=90.89D;
		System.out.println(num1);
		float num2=num1;
		System.out.println(num2); // error: incompatible types: possible lossy conversion from double to float
					  //                 float num2=num1;
					  //                                            ^
					  //                                            1 error
	}
}
