//take number from user caheck wheather divisible by 8 or not 

import java.util.Scanner;
import java.io.PrintStream;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintStream obj = new PrintStream(System.out);
		obj.print("Enter the number : ");
		int num = sc.nextInt();
		if(num%8==0){
			System.out.println(num+" is divisible by 8");
		}else{
			System.out.println(num+" is not divisible by 8");
		}
	}
}
