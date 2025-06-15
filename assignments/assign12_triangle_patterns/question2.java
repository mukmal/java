import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out= new PrintStream(System.out);
		out.print("Enter row size : ");
		int row=Integer.parseInt(br.readLine());		//parseInt(String s) is a static method from the Integer class.
									//
									//It converts the String argument to an int.
		out.print("Enter number : ");
		int num=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				out.print(num+" ");
			}
			out.println();
		}

	}
}


//Enter row size : 4
//Enter number : 16
//16
//16 16
//16 16 16
//16 16 16 16
