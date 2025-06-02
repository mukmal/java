class Switch{
	public static void main(String[] args){
		char data='A';
		System.out.println("before switch");
		switch(data){
			case 'A':
				System.out.println("A");
				break;
			case 66:
				System.out.println("66");
				break;
			case 'C':
				System.out.println("C");
				break;
			default://default is much similar to else statement 
				System.out.println("in default state");
		}
		System.out.println("after switch");
	}
}
//before switch 
//A
//after switch
