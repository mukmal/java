import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int s=i;s<row;s++){
				out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++){
				out.print(j+" ");
			}
			out.println();
		}		
	}
}

//Enter Row Size : 4
//      1
//    1 2 3
//  1 2 3 4 5
//1 2 3 4 5 6 7
