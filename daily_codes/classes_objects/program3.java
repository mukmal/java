

class Demo{
	int x=10;
	static int y=20;
	String str1="Mukesh";
	static String str2="Komal";
	public static void main(String[] args){
		Demo obj=new Demo();
		System.out.println(obj.x);	//10
		System.out.println(y);		//20
		System.out.println(obj.str1);	//Mukesh
		System.out.println(str2);	//Komal
	}
}
