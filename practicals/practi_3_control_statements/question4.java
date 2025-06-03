class Switch{
	public static void main(String[] args){
		int z=1;
		for(;;){
		if(z>10 && z%2==0){
			break;
		}
		System.out.println(z++);
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
 10
 11
 */
