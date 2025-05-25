class logical{
	public static void main(String[] args){
		int x=10;
		int y=20;
		System.out.println(x&&y);		//logical_op.java:5: error: bad operand types for binary operator '&&'
							//                System.out.println(x&&y);
							//                                                    ^
							//                                                      first type:  int
							//                                                        second type: int
							//                                                        1 error
	}
}
