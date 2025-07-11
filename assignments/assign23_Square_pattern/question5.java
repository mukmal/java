import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		int num = row;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++)	{
				if(i%2==1 && j%2==0) {
					out.print("$ ");
					num++;
				}else{
					out.print(num+" ");
				}
			}	
			out.println();
		}
	}
}


//Enter Row Size : 4
//4 $ 5 $
//6 6 6 6
//6 $ 7 $
//8 8 8 8
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign23_Square_pattern$ java Demo
//Enter Row Size : 3
//3 $ 4
//4 4 4
//4 $ 5
