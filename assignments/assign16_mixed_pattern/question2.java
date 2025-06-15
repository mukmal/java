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
		int ch=64+row;
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				out.print((char)ch);
				out.print(num-- +" ");
			}
			num=row;
			num+=i;
			out.println();
		}
	}
}



//Enter row size : 4
//D4 D3 D2 D1
//D5 D4 D3 D2
//D6 D5 D4 D3
//D7 D6 D5 D4
