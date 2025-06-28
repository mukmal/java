class Demo{
	public static void main(String[] args){
		String str1="Core2web";
		String str2="Core2web";
		String str3=new String("Core2web");
		String str4=new String("Core2web");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}

//2060468723
//2060468723
//622488023
//1933863327
