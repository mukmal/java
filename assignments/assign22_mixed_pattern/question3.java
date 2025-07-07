import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		int r=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row-i;j++){
				out.print("  ");
			}
			for(int j=1;j<=i;j++){
				out.print(r+" ");
			r+=row;
			}
			out.println();
		}	
	}
}


//Enter Row Size : 3
//    1
//      4 7
//      10 13 16
//
//Enter Row Size : 4
//	   1
//       5 9
//   13 17 21
//25 29 33 37
