//take number from user and  print its reverse table

import java.util.Scanner;
import java.io.PrintStream;

class Demo{
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 PrintStream obj = new PrintStream(System.out);
		 obj.print("Enter number : ");
		 int num = sc.nextInt();
		 for(int i=10;i>=1;i--){
		 	System.out.print(i*num+" ");
		 }
		 System.out.println();
	}
}
