import java.io.*;
class PatternDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){

		int r=row;
		char ch=(char)('A'+row-1);
			for(int j=1;j<=row;j++){
				if((i+j)%2==1){
					out.print(ch--+" ");
				}else{
					out.print("# ");
				}
				r++;
			}
			System.out.println();
		}
	}
}

//Enter Row Size : 3
//# C #
//C # B
//# C #
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign21_Square_patterns$ java PatternDemo
//Enter Row Size : 4
//# D # C
//D # C #
//# D # C
//D # C #
