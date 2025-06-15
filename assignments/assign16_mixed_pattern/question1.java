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
			for(int j=1;j<=row;j++){
				out.print(num++ +" ");
			}
			out.println();
		}
	}
}

//Enter row size : 4
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
