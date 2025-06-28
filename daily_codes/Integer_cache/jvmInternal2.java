class Demo{
	public static void main(String[] args){
		int x=10;
		int a=10;
		int b=10;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
}

//120
//120
//120
