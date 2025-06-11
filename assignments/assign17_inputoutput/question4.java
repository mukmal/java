//take number from user and  print its table

import java.util.Scanner;
import java.io.PrintStream;

class Demo{
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 PrintStream obj = new PrintStream(System.out);
		 obj.print("Enter number : ");
		 int num = sc.nextInt();
		 for(int i=1;i<=10;i++){
		 	System.out.print(i*num+" ");
		 }
		 System.out.println();
	}
}
