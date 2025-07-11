import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		PrintStream out=new PrintStream(System.out);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		out.print("Enter Number : ");
		int row = Integer.parseInt(br.readLine());
		int cnt=row;
		for(int i=1;i<=row;i++) {
			for(int s=1;s<i;s++) {
				out.print("  ");
			}
			for(int j=1;j<=(row-i)*2+1;j++) {
				out.print(cnt+" ");
			}
			out.println();
			cnt--;
		}
	}
}

//Enter Number : 4
//4 4 4 4 4 4 4
//  3 3 3 3 3
//    2 2 2
//      1
