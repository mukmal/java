//take number from user and chack wheather even or odd
import java.util.Scanner;
import java.io.PrintStream;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		if(num%2==0){
			System.out.println("number is even");
		}else{
			PrintStream obj = new PrintStream(System.out);
			obj.println("number is odd");
		}
	}
}
