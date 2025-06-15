import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row size : ");
		int row=Integer.parseInt(br.readLine());
		int ch=row*(row+1)/2;
		ch=64+ch;
		for(int i=1;i<=row;i++){
			for(int j=i;j<=row;j++){
				out.print((char)ch-- +"  ");
			}
			out.println();
		}
		
	}
}

//Enter row size : 5
//O  N  M  L  K
//J  I  H  G
//F  E  D
//C  B
//A
