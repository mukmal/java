import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Numbers{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Number : ");
		int num=Integer.parseInt(br.readLine());
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		out.println("Factorial of "+num+" is "+fact);
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 5
//Factorial of 5 is 120
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 8
//Factorial of 8 is 40320
