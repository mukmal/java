class While{
	public static void main(String[] args){
		int num=256985;
		int rem=0;
		int product=1;
		while(num!=0){
			rem=num%10;
			if(rem%2!=0){
				product=product*rem;
			}
			num/=10;
		}
		System.out.println(product);
	}
}

//output : product of odd number output : 225
