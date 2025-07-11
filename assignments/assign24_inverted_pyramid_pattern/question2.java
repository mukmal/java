import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		PrintStream out=new PrintStream(System.out);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		out.print("Enter Number : ");
		int row = Integer.parseInt(br.readLine());
		for(int i=row;i>0;i--) {
			for(int s=row;s>i;s--) {
				out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				out.print(1+" ");
			}
			out.println();
		}
	}
}

//Enter Number : 4
//1 1 1 1 1 1 1
//  1 1 1 1 1
//    1 1 1
//      1
