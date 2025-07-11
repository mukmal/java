import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		PrintStream out=new PrintStream(System.out);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		out.print("Enter Number : ");
		int row = Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++) {
			int num =row+1-i;
			for(int s=1;s<i;s++) {
				out.print("\t");
			}
			for(int j=1;j<=(row-i)*2+1;j++) {
				out.print(num+"\t");
				if(j<=row-i) {
					num--;
				}else {
					num++;
				}
			}
			out.println();
		}
	}
}

//Enter Number : 4
//4       3       2       1       2       3       4
//        3       2       1       2       3
//                2       1       2
//                        1
