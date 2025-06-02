class nested{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;){
				System.out.print(j++ +"  ");
			}
			System.out.println();
		}
	}
}
/*
 1 2 3
 1 2 3
 1 2 3
 */
