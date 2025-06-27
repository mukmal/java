import java.io.*;
class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		int num=row;
		for(int i=1;i<=row;i++){
			for(int k=i;k<=row-1;k++){
				out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++){
				out.print(num+" ");
			}
			num--;
			out.println();
		}
	}
}

//Enter Row Size : 4
//      4
//    3 3 3
//  2 2 2 2 2
//1 1 1 1 1 1 1
