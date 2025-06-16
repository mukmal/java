import java.io.*;
import java.util.Scanner;

class pattern{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		PrintStream out=new PrintStream(System.out);
		out.print("Enter character : ");		//new PrintStream(System.out).print("Enter character : ");
		int ch= isr.read();
		int temp=ch;
		for(char i=65;i<=temp;i++){
			ch=temp;
			for(char j=i;j<=temp;j++){
				out.print((char)ch-- +" ");
			}
			out.println();
		}
	}
}

//Enter character : E
//E D C B A
//E D C B
//E D C
//E D
//E
