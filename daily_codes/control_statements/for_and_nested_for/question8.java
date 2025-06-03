class For{
	public static void main(String[] args){
		char ch='A';
		for(int i=9;i>0;i--){
			if(i%2!=0){
				System.out.print(i+"\t");
			}else{
				System.out.print(ch +"\t");
			}
			ch++;
		}
		System.out.println();
	}
}
