import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int s=i;s<row;s++){
				System.out.print("  ");
			}
			int num=i*2-1;
			for(int j=1;j<=2*i-1;j++){
				out.print(num--+" ");
			}
			out.println();
		}		
	}
}

//Enter Row Size : 4
//      1
//    3 2 1
//  5 4 3 2 1
//7 6 5 4 3 2 1
