import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int j=i;j<=row;j++){
				out.print(j+" ");
			}
			out.println();
		}	
	}
}


//Enter Row Size : 5
//1 2 3 4 5
//2 3 4 5
//3 4 5
//4 5
//5
