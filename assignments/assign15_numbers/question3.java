import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Numbers{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter number : ");	
		int num=Integer.parseInt(br.readLine());
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count!=2){
			out.println(num+" is Composite Number");
		}else{
			out.println(num+" is not Composite Number");
		}
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter number : 4
//4 is Composite Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter number : 11
//11 is not Composite Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter number : 6
//6 is Composite Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter number : 10
//10 is Composite Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign15_numbers$ java Numbers
//Enter number : 17
//17 is not Composite Number
