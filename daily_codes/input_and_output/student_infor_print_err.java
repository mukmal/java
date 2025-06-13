import java.util.Scanner;
class  Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		String name=sc.next();
		System.out.print("Enter clg name  : ");
		String cname=sc.next();
		System.out.print("Enter Student id : ");
		int sId=sc.nextInt();
		System.out.print("Enter CGPA : ");
		float marks=sc.next();		//return type of next method is string i.e. error gives as incompatible types String cannot be converted to float
		System.out.println("Student name : "+name);
		System.out.println("clg name : "+cname);		
		System.out.println("Student ID : "+sId);
		System.out.println("Marks : "+marks);
	}
}
