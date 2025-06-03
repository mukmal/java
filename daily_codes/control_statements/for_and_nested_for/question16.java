class For{
	public static void main(String[] args){
		int num=1;
		int count=1;
		char ch='B';
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(count%2==0){
					System.out.print(ch++ +" ");
					ch++;
				}else{
					System.out.print(num++ +" ");
					num++;
				}
				count++;
			}
			System.out.println();
		}
	}
}

/*
 1 B 3
 D 5 F
 7 H 9
 */
