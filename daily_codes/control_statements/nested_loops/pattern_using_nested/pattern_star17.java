class nested{
	public static void main(String[] args){
		char ch = 65;
		int num = 1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=3;j++){
				if(i%2==0){
				System.out.print(ch++ +"  ");
				}else{
					System.out.print(num++ +"  ");
				}
			}
			System.out.println();
		}
	}
}
/*
 1 2 3
 A B C
 1 2 3
 A B C
 */
