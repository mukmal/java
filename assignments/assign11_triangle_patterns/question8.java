import java.io.*;


class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row size: ");
		int row=Integer.parseInt(br.readLine());
		for(int i=row;i>0;i--){
			for(int j=i;j>0;j--){
				out.print(i+" ");
			}
			out.println();
		}
	}
}

//Enter row size: 7
//7 7 7 7 7 7 7
//6 6 6 6 6 6
//5 5 5 5 5
//4 4 4 4
//3 3 3
//2 2
//1
