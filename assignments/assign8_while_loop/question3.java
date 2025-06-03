class While{
	public static void main(String[] args){
		int start=1;
		int end=6;
		char ch='A';
		while(start<=end){
			System.out.print(ch++ +" ");
			start++;
		}
		System.out.println();
	}
}

//A B C D E F
