class While{
	public static void main(String[] args){
		long num=9307922405l;
		long sum=0;
		long rem=0;
		while(num!=0){
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println(sum);
	}
}
//41
