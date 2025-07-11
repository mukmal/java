import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		PrintStream out=new PrintStream(System.out);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		out.print("Enter Number : ");
		int row = Integer.parseInt(br.readLine());
		for(int i=row;i>=1;i--) {
			//spacing
			for(int s=row;s>i;s--) {
				out.print("   ");
			}
			//star
			for(int j=1;j<=2*i-1;j++) {
				out.print("*  ");
			}
			out.println();
		}
	}
}

//Enter Number : 4
//*  *  *  *  *  *  *
//   *  *  *  *  *
//      *  *  *
//         *
