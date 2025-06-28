class Demo{
	public static void main(String[] args){
		int x=9;
		char ch1='9';
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch1));
		int y=57;
		System.out.println(System.identityHashCode(y));
		x=10;
		y=10;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		y=20;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));

	}
}

//207961888
//1253643698
//1097085169
//120
//120
//120
//1871424025
