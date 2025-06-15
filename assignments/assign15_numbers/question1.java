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
		out.print("Factors of "+num+" are ");
		for(int i=1;i<=num;i++){
			if(num%i==0){
				out.print(i);
				if(i!=num){
					out.print(",");
				}
			}
		}
		out.println();
	}
}

//Enter Number : 12
//Factors of 12 are 1,2,3,4,6,12
