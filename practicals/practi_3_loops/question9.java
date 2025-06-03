class While{
	public static void main(String[] args){
		int num=10;
		while(num!=0){
		num=num-1;
		int temp;
		temp*=num;
		System.out.println(temp);
		}
		System.out.println(num);
	}
}
/*
 question9.java:7: error: variable temp might not have been initialized
                 temp*=num;
		                 ^
				 1 error
 */
