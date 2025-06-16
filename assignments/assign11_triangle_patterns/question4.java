class pattern{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			char ch='A';
			ch=(char)(ch+(i-1));
			for(int j=1;j<=i;j++){
				System.out.print(ch++ +"	");
				ch=(char)(ch+i-1);
			}
			System.out.println();
		}
	}
}

//A	
//B	C
//C	D	E
//D	E	F	G
