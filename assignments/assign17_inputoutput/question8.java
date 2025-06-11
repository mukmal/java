//take range as input from the user and print sum of the numbers between them

import java.util.Scanner;
import java.io.PrintStream;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Take range from : ");
		int num1 = sc.nextInt();
		System.out.print("To : ");
		int num2 = sc.nextInt();
		int sum=0;
		for( int i=num1;i<=num2;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
