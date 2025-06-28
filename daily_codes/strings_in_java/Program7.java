class Demo{
	public static void main(String[] args){
		String str1="Core2web";
		String str2="Biencaps";
		String str3="Core2web";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}

//2060468723
//622488023
//2060468723
