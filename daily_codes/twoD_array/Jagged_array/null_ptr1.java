import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(x);
		sc=null;
		int y=sc.nextInt();
		System.out.println(y);
	}
}

//50
//50
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.Scanner.nextInt()" because "<local1>" is null
//        at Demo.main(null_ptr1.java:8)
