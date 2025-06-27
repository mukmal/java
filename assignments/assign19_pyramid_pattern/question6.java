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
			//for increasing
			for(int j=1;j<=i;j++){
				out.print(j+" ");
			}
			//for decreasing
			for(int l=i-1;l>0;l--){
				out.print(l+" ");
			}
			out.println();
		}
	}
}

//Enter Row Size : 4
//      1
//    1 2 1
//  1 2 3 2 1
//1 2 3 4 3 2 1
