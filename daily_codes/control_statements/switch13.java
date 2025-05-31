class Switch{
		public static void main(String[] args){
			int x=50;
			switch(x){
				case 20+30:
					System.out.println("25+30");
				case 25+25:
					System.out.println("25+25");
				case 50:
					System.out.println("50");
				default:
					System.out.println("Default");	
			}
		}
}
//switch13.java:7: error: duplicate case label
//                  case 25+25:
//                  ^
//switch13.java:9: error: duplicate case label
//                  case 50:
//                  ^
//2 errors
