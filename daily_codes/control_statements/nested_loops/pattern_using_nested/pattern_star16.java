class nested{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			char ch='a';
			for(int j=1;j<=3;j++){
				System.out.print((int)ch++ +"  ");//here by typecasting the character into int we have changed the behavior to int
			}
			System.out.println();
		}
	}
}
/*
 97 98 99
 97 98 99 
 97 98 99
 */
