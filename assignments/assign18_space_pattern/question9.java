import java.io.*;


class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int k=2;i>=k;k++){
				out.print("  ");
			}
			int num=1;
			for(int j=i;j<=row;j++){
				out.print(num++ +" ");
			}
			out.println();
		}
	}
}

//Enter row size : 4
//1 2 3 4
//  1 2 3
//    1 2
//      1
