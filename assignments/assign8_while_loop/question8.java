class While{
	public static void main(String[] args){
		int num=216985;
		int temp=num;
		while(temp!=0){
			num=temp%10;
			if(num%2!=0){
				System.out.print(num+" ");
			}
			temp/=10;
		}
		System.out.println();
	}
}
//5 9 1
