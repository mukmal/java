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
			r+=2;
			}
			out.println();
		}	
	}
}

//Enter Row Size : 4
//       1
//     3 5
//   7 9 11
//13 15 17 19
//Enter Row Size : 3
//       1
//     3 5
//   7 9 11
