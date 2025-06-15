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
		for(int i=1;i<=row;i++){
			int num=row;
			int ch=96+row;
			for(int j=1;j<=i;j++){
				if(i%2==0){
					out.print(num-- +" ");
				}else{
					out.print((char)ch-- +" ");
				}
			}
			out.println();
		}

	}
}

//Enter Number : 4
//d
//4 3
//d c b
//4 3 2 1
