import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out= new PrintStream(System.out);
		out.print("Enter row size : ");
		int row=Integer.parseInt(br.readLine());
		char ch='a';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(j%2==0){
					out.print(ch++ +" ");
				}else{
					out.print(j+" ");
					ch++;
				}
			}
			out.println();
		}
	}
}

//Enter row size : 4
//1
//1 c
//1 e 3
//1 h 3 j
