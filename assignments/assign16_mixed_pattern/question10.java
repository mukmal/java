import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;

class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Number : ");
		long num=Long.parseLong(br.readLine());
		long reverse=0,rem=0;
		while(num>0){
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		while(reverse>0){
			rem=reverse%10;
			if(rem%2!=0){
				out.print(rem*rem);
				out.print(",");
				}
			}
			reverse/=10;
		}
		out.println();
	}
}


//Enter Number : 54632985632
//25,9,81,25,9,
