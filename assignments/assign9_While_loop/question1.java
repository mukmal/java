class While{
	public static void main(String[] args){
		int num=2569185;
		int rem=0;
		while(num!=0){
			rem=num%10;
			if(rem%2==0){
				System.out.print(rem+" ");
			}
			num/=10;
		}
		System.out.println();
	}
}

//output : even number  8 6 2
