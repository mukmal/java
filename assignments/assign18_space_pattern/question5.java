import java.io.*;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int k=1;k<=row-i;k++){
				out.print("  ");
			}
			for(int j=1;j<=i;j++){
				out.print(row*j+" ");
			}
			out.println();
		}
	}
}

//Enter row size : 4
//      4
//    4 8
//  4 8 12
//4 8 12 16
