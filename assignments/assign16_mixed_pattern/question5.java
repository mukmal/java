import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;

class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row size : ");
		int row=Integer.parseInt(br.readLine());
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				out.print(num*j +" ");
			}
			num++;
			out.println();
		}
	}
}


//Enter row size : 4
//1
//2 4
//3 6 9
//4 8 12 16
