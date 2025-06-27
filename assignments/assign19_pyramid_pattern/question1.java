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
			for(int j=1;j<=i*2-1;j++){
				out.print("* ");
			}
			out.println();
		}
	}
}


//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign19_pyramid_pattern$ java Pattern
//Enter Row Size : 4
//      *
//    * * *
//  * * * * *
//* * * * * * *
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign19_pyramid_pattern$ java Pattern
//Enter Row Size : 5
//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
