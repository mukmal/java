class error{
	public static void main(String[] args){
		int x=10;
		int x=20;
		System.out.println(x);//error variable x is already defined in method main
		int y=8;
		y=20;//this is allowed because java checks the values that are going to be assigned further
		System.out.println(y); 	//20
		int a;
		System.out.println(a);	// error: variable x might not have been initialized 
					// this wrror becase the java doen't assign values 
					// In C/C++ program it will give output as 0(garbage value)without assign 
	}
}
