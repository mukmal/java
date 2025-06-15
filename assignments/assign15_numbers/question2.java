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
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			out.println(num+" is a prime number ");
		}else{
			out.println(num+" is not a prime number ");
		}
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 7
//7 is a prime number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 13
//13 is a prime number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter Number : 12
//12 is not a prime number
