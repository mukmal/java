import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;
import java.io.BufferedReader;

class pattern{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row size : ");
		int row = Integer.parseInt(br.readLine());
		char ch='a';
		int num=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					out.print(ch++ +" ");
					num++;
				}else{
					out.print(num++ +" ");
					ch++;
				}
			}
			out.println();
		}
	}
}

//Enter row size : 4
//1
//b c
//4 5 6
//g h i j
