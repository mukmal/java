class Demo{
	public static void main(String[] args){
		String str1="Rahul";
		String str2="Rahul";
		System.out.println(str1.equals(str2));//content
		System.out.println(str1==str2);//Address
		String str3="Ashish";
		String str4=new String("Ashish");
		System.out.println(str3.equals(str4));//content
		System.out.println(str3==str4);//Address
	}
}
//true
//true
//true
//false
