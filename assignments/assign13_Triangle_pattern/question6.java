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
		for(int i=1;i<=row;i++){
			char ch1='a';
			int num=1;
			int a=1;
			for(int j=i;j<=row;j++){
				if(a%2==0){
					out.print(ch1++ +" ");
				}else{
					out.print(num++ +" ");
				}
				a++;
			}
			out.println();
		}		
	}
}

//Enter row size : 4
//1 a 2 b
//1 a 2
//1 a
//1
