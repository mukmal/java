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
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				out.print("* ");
			}
			out.println();
		}

	}
}


//Enter row size : 4
//*
//* *
//* * *
//* * * *
