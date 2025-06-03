class For{
	public static void main(String[] args){
		char num='A';
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
