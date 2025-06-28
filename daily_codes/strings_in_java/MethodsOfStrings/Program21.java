class Demo{
	public static void main(String[] args){
		String str1="Rahul";
		String str2=new String("Rahul");
		System.out.println(str1.equals(str2));//true
		String str3=new String("Rahulp");
		System.out.println(str1.equals(str3));//false
	}
}
