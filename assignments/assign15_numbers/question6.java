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
		int temp=num;
		int rem=0;
		int reverse=0;
		while(num>0){
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		if(reverse==temp){
			out.println(temp+" is palindrome Number ");
		}else{
			out.println(temp+" is not palindrome Number ");
		}
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 12121
//12121 is palindrome Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 12345
//12345 is not palindrome Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 57322375
//57322375 is palindrome Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 45698654
//45698654 is not palindrome Number
