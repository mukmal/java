/*number is divisible by 5   range 50-10*/
class While{
	public static void main(String[] args){
		int num=50;
		while(num>=10){
			if(num%5==0){
				System.out.print(num +" ");
			}
			num--;
		}
		System.out.println();

	}	
}
