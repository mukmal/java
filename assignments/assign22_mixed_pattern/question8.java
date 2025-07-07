import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int num=row+1-i;
			for(int s=i;s<row;s++){
				out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++){
				out.print(num++ +" ");
			}			
			out.println();
		}
	}
}

//Enter Row Size : 4
//      4
//    3 4 5
//  2 3 4 5 6
//1 2 3 4 5 6 7
