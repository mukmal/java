import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row =Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int num=row-1+i;
			for(int j=i;j<row;j++){
				out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++){
				out.print(num-- +" ");
				
			}

			out.println();
		}
		
	}
}


//Enter Row Size : 4
//      4
//    5 4 3
//  6 5 4 3 2
//7 6 5 4 3 2 1
