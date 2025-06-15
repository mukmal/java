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
		int rem=0;
		int reverse=0;
		while(num>0){
			rem=num%10;
			reverse=(reverse*10)+rem;			
			num=num/10;
		}
		out.println("Reverse Number is "+reverse);
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 7853
//Reverse Number is 3587
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 93079224
//Reverse Number is 42297039
