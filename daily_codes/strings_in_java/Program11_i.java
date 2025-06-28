class Demo{
	public static void main(String[] args){
		String str1="Rahul";
		String str2=str1;
		String str3=new String("Patel");
		String str4=str3;
		String str5=new String(str1);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
	}
}

//2060468723
//2060468723
//622488023
//622488023
//1933863327
