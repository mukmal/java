class Switch{
	public static void main(String[] args){
		int num=1;
		System.out.println("before switch");
		switch(num){
			case 1:
				System.out.println("One");
				// break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default://default is much similar to else statement 
				System.out.println("in default state");
		}
		System.out.println("after switch");
	}
}
// before switch
// One 
// Two
// after switch
