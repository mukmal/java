class For{
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			char ch='A';
			for(int j=1;j<=3;j++){
				System.out.print(j);
				System.out.print(ch++);
				System.out.print("  ");
			}
			System.out.println();
		}

	}
}
//1A  2B  3C
//1A  2B  3C
//1A  2B  3C
