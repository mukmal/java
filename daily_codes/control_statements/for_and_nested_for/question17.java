class For{
	public static void main(String[] args){
		int num=1;
		char ch='D';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=3;j++){
				if(i%2==0){
					System.out.print(ch++ +" ");
				}else{
					System.out.print(num++ +" ");
					if(i==3){
						ch++;
					}
				}
			}
			System.out.println();
		}
	}
}
/*
 1 2 3
 D E F
 4 5 6
 J K L

  */
