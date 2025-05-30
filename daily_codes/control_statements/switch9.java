class Switch{
	public static void main(String[] args){
		char data='A';
		System.out.println("before switch");
		switch(data){
			case 'A':
				System.out.println("A");
				break;
			case 65:
				System.out.println("65");
				break;
			case 66:
				System.out.println("66");
				break;
			case 'B':
				System.out.println("B");
				break;
			default://default is much similar to else statement 
				System.out.println("in default state");
		}
		System.out.println("after switch");
	}
}
/*switch9.java:9: error: duplicate case label
 *                         case 65:
 *                               ^
 switch9.java:15: error: duplicate case label
 *                         case 'B':
 *                               ^
 * 			         2 errors
 */ 
