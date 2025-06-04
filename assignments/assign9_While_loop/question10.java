class While{
	public static void main(String[] args){
		int num=9367924;
		int rem=0;
		int product=1;
		int sum=0;
		while(num!=0){
			rem=num%10;
			if(rem%2==0){
				product=product*rem;
			}else{
				sum=sum+rem;
			}
			num/=10;
		}
		System.out.println("Product of even number : "+product);
		System.out.println("sum of odd number      : "+sum);
	}
}

//output : product of even number output : 48
//output : sum of odd number output      : 28
