class While{
	public static void main(String[] args){
		int num=9307;
		int temp=num;
		while(temp!=0){
			System.out.println(temp%10);
			temp/=10;
		}
	}
}
/*
 7
 0
 3
 9
 */
