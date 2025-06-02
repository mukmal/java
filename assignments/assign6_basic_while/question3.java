/*divisible by 4 & 7    	range 50-100*/
class While{
	public static void main(String[] args){
		int num=50;
		while(num<=100){
			if(num%4==0 && num%7==0){
			System.out.print(num+ " ");
			}
			num++;
		}
			System.out.println();
	}	
}
