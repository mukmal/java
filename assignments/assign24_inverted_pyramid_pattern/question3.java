import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		PrintStream out=new PrintStream(System.out);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		out.print("Enter Number : ");
		int row = Integer.parseInt(br.readLine());
		int num=1;
		for(int i=1;i<=row;i++) {
			for(int s=2;s<=i;s++) {
				out.print("  ");					
			}
			for(int j=1;j<=(row-i)*2+1;j++) {
				out.print(num+++" ");
			}
			out.println();
		}
	}
}

//Enter Number : 4
// 1 2  3  4  5  6  7
//   8  9 10 11 12
//     13 14 15
//        16
