import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;
class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintStream out= new PrintStream(System.out);
		out.print("Enter Row size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				out.print(row*j+" ");
			}
			out.println();
		}
	}
}

//Enter Row size : 4
//4
//4 8
//4 8 12
//4 8 12 16
