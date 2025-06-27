import java.io.*;
class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int k=i;k<=row-1;k++){
				out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++){
				out.print("1 ");
			}
			out.println();
		}
	}
}

//Enter Row Size : 5
//        1
//      1 1 1
//    1 1 1 1 1
//  1 1 1 1 1 1 1
//1 1 1 1 1 1 1 1 1
