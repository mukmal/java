import java.io.*;
import java.util.Scanner;

class pattern{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		PrintStream out=new PrintStream(System.out);
		out.print("Enter character : ");		//new PrintStream(System.out).print("Enter character : ");
		int row=Integer.parseInt(br.readLine());
		for(char i=1;i<=row;i++){
			int ch=64+i;
			for(char j=i;j<=row;j++){
				if(row%2==0){
					if(ch%2==0){
						out.print((char)ch +" ");
					}else{
						out.print(ch +" ");
					}
				}else{
					if(ch%2!=0){
						out.print((char)ch +" ");
					}else{
						out.print(ch +" ");
					}
				}
				ch++;
			}
			out.println();
		}
	}
}

//Enter character : 4
//65 B 67 D
//B 67 D
//67 D 
//D
//
//
//Enter character : 3
//A 66 C
//66 C
//C
