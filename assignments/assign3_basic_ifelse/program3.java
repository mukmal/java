class ifelse{
	public static void main(String[] args){
		int num=13;
		//num=8;
		//num=10		
		if(num%2==0 && num<10){
		System.out.println("number is even and > 10");
		}else if(num%2!=0 && num>10){
		System.out.println("Number is odd and > 10");
		}else{
		System.out.println("number is even and = 10");
		}
	}
}
