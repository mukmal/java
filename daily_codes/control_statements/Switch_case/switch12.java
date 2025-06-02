class Switch{
	public static void main(){
		boolean x=true;
		switch(x){
			case true:
				System.out.println("True");
				break;
			case false:
				System.out.println("False");
				break;
			default:
				System.out.println("Default");
		}
	}
}
//switch12.java:4: error: patterns in switch statements are a preview feature and are disabled by default.
//                switch(x){
//                                      ^
//                                        (use --enable-preview to enable patterns in switch statements)
//switch12.java:5: error: constant label of type boolean is not compatible with switch selector type boolean
//                  case true:
//                  ^
//switch12.java:8: error: constant label of type boolean is not compatible with switch selector type boolean
//                case false:
