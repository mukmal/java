class While{
	public static void main(String[] args){
		int num=216985;
		int rem=0;
		while(num!=0){
			rem=num%10;
			if(rem%2==0){
				System.out.print(rem*rem*rem +" ");
			}
			num/=10;
		}
		System.out.println();
	}
}

//output : cube of even number  512 216 8
