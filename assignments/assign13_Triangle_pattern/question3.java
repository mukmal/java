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
		int num=row*(row+1)/2;
		for(int i=1;i<=row;i++){
			for(int j=i;j<=row;j++){
				out.print(num*2 +"  ");
				num--;
			}
			out.println();
		}		
	}
}


//Enter row size : 4
//20  18  16  14
//12  10  8
//6  4
//2
