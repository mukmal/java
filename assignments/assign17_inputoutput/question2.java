// write a program to print voter is eligible or not also negative values are not available (take age from user)
import java.util.Scanner;
import java.io.PrintStream;

class Demo{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter age : ");
		int age = sc.nextInt();
		if(age<0){
			PrintStream obj = new PrintStream(System.out);
			obj.println("! Invalid age");
		}else{
			if(age<18){
				System.out.println("voter is not eligible for voting ");
			}else{
				System.out.println("voter is eligible for voting ");
			}
		}

	}
}
