class While{
	public static void main(String[] args){
		int num=93079224;
		int temp=num;
		int count=0;
		while(temp!=0){
			temp/=10;
			count++;
		}
		System.out.println(count);
	}
}
// no of digit =8
