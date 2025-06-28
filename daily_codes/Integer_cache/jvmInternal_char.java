class Demo{
	public static void main(String[] args){
		char ch1='A';
		char ch2='a';
		char ch3='B';
		int x=65;
		int y=97;
		int z=66;
		System.out.println(System.identityHashCode(ch1));
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch2));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(ch3));
		System.out.println(System.identityHashCode(z));
	}
}

//663923625
//1496794459
//333464813
//851149789
//998066836
//93540193
