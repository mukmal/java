class For{
	public static void main(String[] args){
		char ch='A';
		for(int i=9;i>0;i--){
			if(i%2!=0){
				System.out.print(ch +"\t");
			}else{
				int ch1=ch+32;
				System.out.print((char)ch1 +"\t");
			}
			ch++;
		}
		System.out.println();
	}
}
//A       b       C       d       E       f       G       h       I
