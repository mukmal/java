class nested{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			int ch=97;
			for(int j=1;j<=3;j++){
				System.out.print((char)ch++ +"  ");//here by typecasting the integer into char we have changed the behavior to char
			}
			System.out.println();
		}
	}
}
/*
 a b c
 a b c
 a b c
 */
