class While{
	public static void main(String[] args){
		int num=1;
		int i=1;
		while(i<=4){
			int j=1;
			while(j<=4){
				if(num%2==0){
					num++;
				}
				System.out.print(num++ +"   ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
//1   3   5   7
//9   11   13   15
//17   19   21   23
//25   27   29   31
