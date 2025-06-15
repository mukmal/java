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
		int ch=64+(row*(row+1)/2);
		for(int i=1;i<=row;i++){
			for(int j=i;j<=row;j++){
				out.print((char)ch-- +" ");
			}
			out.println();
		}
	}
}

//Enter Number : 4
//J I H G
//F E D
//C B
//A
