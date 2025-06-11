//take marks of 4 subjects and print total marks out of 100

import java.io.PrintStream;
import java.util.Scanner;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintStream obj = new PrintStream(System.out);
		obj.print("Enter marks of Chemistry : ");
		int chem=sc.nextInt();
		obj.print("Enter marks of Biology : ");
		int bio=sc.nextInt();
		obj.print("Enter marks of Physics : ");
		int phy=sc.nextInt();
		obj.print("Enter marks of Maths : ");
		int mths=sc.nextInt();

		obj.println("Total marks out of 100 is : "+(chem+bio+phy+mths));
	}
}

