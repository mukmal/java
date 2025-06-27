import java.io.*;
class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		int num=1;
		for(int i=1;i<=row;i++){
			for(int k=i;k<=row-1;k++){
				out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++){
				out.print(num++ +" ");
			}
			out.println();
		}
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign19_pyramid_pattern$ java Pattern
//Enter Row Size : 3
//    1
//  2 3 4
//5 6 7 8 9
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign19_pyramid_pattern$ java Pattern
//Enter Row Size : 4
//      1
//    2 3 4
//   5 6 7 8 9
//10 11 12 13 14 15 16 
