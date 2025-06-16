class pattern{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			int num=4;
			for(int j=1;j<=i;j++){
				System.out.print(num-- +"	");
			}
			System.out.println();
		}
	}
}

//4	
//4	3
//4	3	2
//4	3	2	1
