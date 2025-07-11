import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		char ch = (char) ('a'+row-1);
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j==1){
					out.print((char)(ch-32)+" ");
					ch++;
				}else{
					out.print(ch+++" ");
				}
			}
			out.println();
		}
	}
}

//Enter Row Size : 3
//C d e
//F g h
//I j k
