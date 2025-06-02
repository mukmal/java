class Continue{
	public static void main(String[] args){
		for(int i=1;i<=20;i++){
			if(i%3==0 && i%5==0){
			continue;
			}
			System.out.print(i +" ");	//1 2 3 4 5 6 7 8 9 10 11 12 13 14 16 17 18 19 20
		}
		System.out.println();
	}
}
