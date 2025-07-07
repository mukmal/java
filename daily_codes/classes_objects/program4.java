

class Demo{
	int x=10;
	String str1="Mukmal";
	static String str2="Mukesh";
	String str3=new String("Komal");
	static String str4=new String("xyz");
	public static void main(String[] args){
		Demo obj=new Demo();
		System.out.println(obj.x);	//10
		System.out.println(obj.str1);	//Mukmal
		System.out.println(obj.str2);	//Mukesh
		System.out.println(obj.str3);	//Komal
		System.out.println(obj.str4);	//xyz
	}
}
