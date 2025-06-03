class While{
	public static void main(String[] args){
		int num=214367689;
		int rem=0;
		int oddcount=0,evencount=0;
		while(num!=0){
			rem=num%10;
			if(rem%2==0){
				evencount++;
			}else{
				oddcount++;
			}
			num/=10;
		}
		System.out.println("odd count: "+oddcount+" even count: "+evencount);
	}
}
//odd count: 4 even count: 5
