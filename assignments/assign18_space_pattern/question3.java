import java.io.*;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int num=row;
			for(int k=1;k<=row-i;k++){		//space loop
				out.print("  ");
			}
			for(int j=1;j<=i;j++){
				out.print(num-- +" ");
			}
			out.println();
		}

	}
}

//Enter row size : 4
//      4
//    4 3
//  4 3 2
//4 3 2 1
