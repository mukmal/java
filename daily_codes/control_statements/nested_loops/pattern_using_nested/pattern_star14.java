class nested{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			char ch='a';
			for(int j=1;j<=3;j++){
				System.out.print(ch++ +"  ");
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
