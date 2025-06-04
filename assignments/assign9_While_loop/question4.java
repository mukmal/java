class While{
	public static void main(String[] args){
		int num=256985;
		int rem=0;
		while(num!=0){
			rem=num%10;
			if(rem%2!=0){
				System.out.print(rem*rem +" ");
			}
			num/=10;
		}
		System.out.println();
	}
}

//output : square of odd number  25 81 25
