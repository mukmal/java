class While{
	public static void main(String[] args){
		int num=436780521;
		int rem=0;
		while(num!=0){
			rem=num%10;
			if(rem%2==0 || rem%3==0){
				if(rem!=0){
					System.out.print(rem+" ");
				}
			}
			num/=10;
		}
		System.out.println();
	}
}

//output : divisible by 2 & 3 (	2 8 6 3 4 )
