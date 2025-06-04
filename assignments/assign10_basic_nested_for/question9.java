class For{
	public static void main(String[] args){
		int n=1;
		for(int i=1;i<=4;i++){
			char ch='D';
			for(int j=1;j<=4;j++){
				System.out.print(ch);
				System.out.print(n++);
				System.out.print("  ");
			}
			System.out.println();
		}

	}
}
//D1  D2  D3  D4
//D5  D6  D7  D8
//D9  D10  D11  D12
//D13  D14  D15  D16
