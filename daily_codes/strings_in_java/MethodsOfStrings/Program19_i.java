class Demo{
	public static void main(String[] args){
		String str="Shashi";
		System.out.println(str.charAt(6));	
	}
}

//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 6
//        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//                at java.base/java.lang.String.charAt(String.java:1517)
//                        at Demo.main(Program19_i.java:4)
