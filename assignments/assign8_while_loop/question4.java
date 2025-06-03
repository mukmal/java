class While{
	public static void main(String[] args){
		int start=1;
		int end=6;
		char ch='A';
		while(start<=end){
			if(start%2!=0){
				System.out.print(ch++ +" ");
				start++;
			}else{
				System.out.print(start++ +" ");
				ch++;
			}
		}
		System.out.println();
	}
}

//A 2 C 4 E 6
