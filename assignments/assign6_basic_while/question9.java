/*sum of odd numbers 150 to 101*/
class While{
	public static void main(String[] args){
		int n=150;
		int sum=0;
		while(n>100){
			if(n%2!=0){
				sum=sum+n;	
			}
			n--;
		}
		System.out.println(sum);
	}	
}
