class Switch{
	public static void main(String[] args){
		float num=2f;
		System.out.println("before switch");
		switch(num){
			case 1:
				System.out.println("One");
				break;
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
// switch7.java:5: error: patterns in switch statements are a preview feature and are disabled by default.
//    switch(num){
//           ^
//    (use --enable-preview to enable patterns in switch statements)
// switch7.java:6: error: constant label of type int is not compatible with switch selector type float
//    case 1:
//         ^
// switch7.java:9: error: constant label of type int is not compatible with switch selector type float
//    case 2:
//         ^
// switch7.java:12: error: constant label of type int is not compatible with switch selector type float
//    case 3:
//         ^
//                                                                                                                                                                      //     4 errors
