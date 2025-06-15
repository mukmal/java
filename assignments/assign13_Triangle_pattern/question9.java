import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row Size : ");
		int row=Integer.parseInt(br.readLine());
		int patternnumbers= row*(row+1)/2;
		patternnumbers*=2;
		for(int i=1;i<=row;i++){
			for(int j=i;j<=row;j++){
				out.print(--patternnumbers+" ");
				patternnumbers--;
			}
			out.println();
		}
	}
}


//Enter row Size : 5
//29 27 25 23 21
//19 17 15 13
//11 9 7
//5 3
//1
