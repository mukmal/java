class While{
	public static void main(String[] args){
		int x=0;
		while(true){
			++x;
			if(x%10==0){
				break;
			}
			System.out.println(x);
		}
	}
}
/*
 1
 2
 3
 4
 5
 6
 7
 8
 9
 
 */
