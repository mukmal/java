class For{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){			//for 4 row i<=4
			char ch='d';
			for(int j=1;j<=4;j++){		//	    j<=4
				System.out.print(ch-- +"  ");
			}
			System.out.println();
		}
	}
}
//d  c  b  a
//d  c  b  a
//d  c  b  a
//d  c  b  a
