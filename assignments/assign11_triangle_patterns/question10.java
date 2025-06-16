import java.io.*;


class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row size: ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int j=i;j<=row;j++){
				out.print(j +" ");
			}
			out.println();
		}
	}
}

//Enter row size: 4
//1 2 3 4
//2 3 4
//3 4
//4
