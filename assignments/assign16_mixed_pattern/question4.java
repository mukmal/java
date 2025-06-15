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
		
		for(int i=1;i<=row;i++){
			int num=row-i+1;
			for(int j=1;j<=i;j++){
				out.print(num*j+" ");	
				}
			out.println();
		}
	}
}

//Enter row size : 4
//4
//3 6 
//2 4 6
//1 2 3 4
