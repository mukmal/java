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
			char ch1='A';
			char ch2='a';
			for(int j=i;j<=row;j++){
				if(i%2==0){
					out.print(ch2++ +" ");
				}else{
					out.print(ch1++ +" ");
				}
			}
			out.println();
		}		
	}
}

//Enter row size : 4
//A B C D
//a b c
//A B
//a
