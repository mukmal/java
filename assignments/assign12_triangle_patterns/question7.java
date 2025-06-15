import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out= new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		char ch='A';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2!=0){
					out.print(j+" ");
					ch++;
				}else{
					out.print(ch++ +" ");
				}
			}
			out.println();
		}
	}
}

//Enter Row Size : 4
//1
//B C
//1 2 3
//G H I J
