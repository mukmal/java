import java.io.*;
class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=row;i>0;i--){
			int num=3;
			//spacing
			for(int s=1;s<=i-1;s++){
				out.print("  ");
			}
			//decreasing
			for(int j=row;j>=i;j--){
				out.print(j+" ");
			}
			//increasing
			for(int k=i+1;k<=row;k++){
				out.print(k +" ");
			}
			out.println();
		}
	}
}

//Enter Row Size : 4
//      4
//    4 3 4
//  4 3 2 3 4
//4 3 2 1 2 3 4
