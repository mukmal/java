class Demo{
	public static void main(String[] args){
		String str="Ashish";
		System.out.println(str.substring(2));//hish
		System.out.println(str.substring(2,5));//his
		System.out.println(str.substring(2,8));

	}
}

//hish
//his
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 2, end 8, length 6
//        at java.base/java.lang.String.checkBoundsBeginEnd(String.java:4606)
//                at java.base/java.lang.String.substring(String.java:2709)
//                        at Demo.main(Program26.java:6)
