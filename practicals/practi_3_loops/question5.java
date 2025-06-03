class For{
	public static void main(String[] args){
		for(int i=1;i>0;i++){
			if(i==100){
				break;
			}
			if(i%2==0 || i%3==0 || i%4==0 || i%5==0){
				continue;
			}
			System.out.println(i+" ");
		}
	}
}
