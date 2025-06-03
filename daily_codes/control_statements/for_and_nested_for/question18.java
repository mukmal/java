class For{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			int num=4;
			for(int j=1;j<=4;j++){
				if(i%2==0){
					System.out.print(num-- +" ");
				}else{
					System.out.print(j +" ");
				}
			}
			System.out.println();
		}
	}
}
/*
 1 2 3 4
 4 3 2 1
 1 2 3 4
 4 3 2 1

 */
