class nested{
	public static void main(String[] args){
		int num=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(num++ +"  ");
			}
			num=1;
			System.out.println();
		}
	}
}
/*
 1 2 3
 1 2 3
 1 2 3
 */
