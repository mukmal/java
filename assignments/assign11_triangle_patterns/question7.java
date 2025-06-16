import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=row;i>=0;i--){
			for(int j=i;j>=0;j--){
				out.print("* ");
			}
			out.println();
		}
	}

}

//Enter Row size : 4
//* * * * *
//* * * *
//* * *
//* *
//*
