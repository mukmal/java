import java.io.*;
class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row Size: ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int k=2;i>=k;k++){
				out.print("  ");
			}
			int ch=64+row;
			for(int j=i;j<=row;j++){
				out.print((char)ch-- +" ");
			}
			out.println();
		}
	}
}


//Enter row Size: 4
//D C B A
//  D C B
//    D C
//      D
