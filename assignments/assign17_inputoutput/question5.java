//take number from user check wheather number is present in 16 table or not 

import java.util.Scanner;
import java.io.PrintStream;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintStream obj = new PrintStream(System.out);
		obj.print("Enter the number : ");
		int num = sc.nextInt();
		if(num%16==0){
			System.out.println(num+" is present in 16 table");
		}else{
			System.out.println(num+" is not present in 16 table");
		}
	}
}
