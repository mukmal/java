class Break{
	public static void main(String[] args){
		for(int i=1;i<=50;i++){
			if(i%4==0 && i%5==0){
				break;
			}
			System.out.println(i);//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
		}
	}
}
