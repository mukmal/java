class Demo{
	public static void main(String[] args){
		String str1="Badhe";
		String str2="Rahul";
		String str3=new String("BadheRahul");
		String str4=str3;
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}

//2060468723
//622488023
//1933863327
//1933863327
