class Demo{
	public static void main(String[] args){
		String str1="Ashish";
		String str2="Ashira";
		System.out.println(str1.compareTo(str2));//1
		str2="ashira";
		System.out.println(str1.compareTo(str2));//-32
	}
}
