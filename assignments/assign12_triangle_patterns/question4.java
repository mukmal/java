import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out= new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int ch=64+row;
			for(int j=1;j<=i;j++){
				out.print((char)ch-- +" ");	
			}
			out.println();
		}
	}
}

//Enter Row Size : 4
//D
//D C
//D C B
//D C B A
