/*in 100 to 24 print numbers which are divisible by 4 & 5 	*/
class While{
	public static void main(String[] args){
		int n=100;
		while(n>=24){
			if(n%4==0 && n%5==0){
				System.out.print(n +"  ");
			}
		n--;
		}
		System.out.println();
	}	
}
