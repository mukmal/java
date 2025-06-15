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

//Enter Row Size : 5
// 2  4  6  8  10
//12 14 16 18
//20 22 24
//26 28
//30
