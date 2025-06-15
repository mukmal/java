import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;

class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Number : ");
		int row=Integer.parseInt(br.readLine());
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=i;j<=row;j++){
				out.print(num*2+" ");
				num++;
			}
			out.println();
		}		
	}
}


//Enter Number : 4
//2 4 6 8
//10 12 14
//16 18
//20
