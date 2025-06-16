import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ");
		String name=sc.next();
		System.out.println("Enter your society name ");
		String sname=sc.next();
		System.out.println("Enter your Wing name ");
		char wing=sc.next().charAt(0);			//here typecasting not allowed because of incompatible types : String cannot be converted to int
		System.out.println("Enter your Flat Number");
		int flatno=sc.nextInt();		
		System.out.println("Name : "+name);
		System.out.println("Society Name : "+sname);
		System.out.println("Wing : "+wing);
		System.out.println("Flat no: : "+flatno);
	}
}


//Enter your name
//Mukesh
//Enter your society name
//sun
//Enter your Wing name
//A
//Enter your Flat Number
//504
//Name : Mukesh
//Society Name : sun
//Wing : A
//Flat no: : 504
//
