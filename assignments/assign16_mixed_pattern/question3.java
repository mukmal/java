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
			int ch=64+row;
			for(int j=1;j<=row;j++){
				if(i%2==0){
					out.print(j +" ");
				}else{
					out.print((char)ch-- +" ");
				}
			}
			out.println();
		}
	}
}

//Enter row size : 4
//D C B A
//1 2 3 4
//D C B A
//1 2 3 4
