

class Demo{
	int x=10;
	String str=new String("Ashish");
	static int y=20;
	public static void main(String[] args){
		int a=30;
		int b=30;
		String str1=new String("Ashish");
		Demo obj=new Demo();
		System.out.println(obj.x);		//10
		System.out.println(obj.str);		//Ashish
		System.out.println(y);			//20
		System.out.println(a);			//30
		System.out.println(b);			//30
		System.out.println(str1);	//here obj.str1 then obj.str1 would give an error because str1 is a local variable inside main, not an instance variable of Demo. Local variables cannot be accessed through objects
							//Ashish
	}
}
