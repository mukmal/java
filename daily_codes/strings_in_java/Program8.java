class Demo{
	public static void main(String[] args){
		String str1="Kanha";
		String str2="Ashish";
		String str3=new String("Kanha");
		String str4="KanhaAshish";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
//2060468723
//622488023
//1933863327
//112810359
