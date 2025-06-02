/*take two numbers if both the numbers are positive multiply them and provide switch case to verify the number if even or odd if -ve terminate "Sorry negative numbers ae not allowed"*/
class Switch{
	public static void main(String[] args){
		int a=23;
		int b=32;
		if(a>0 && b>0){
			switch(a){
				case 23:
					if(a%2==0){
					System.out.println("number is even");
					}else{
					System.out.println("number is odd");
					}
			}
			switch(b){
				case 32:
					if(b%2==0){
					System.out.println("number is even");
					}else{
					System.out.println("number is odd");
					}
			}
		}else{
		System.out.println("Sorry negative numbers are not allowed");
		}
	}
}
