import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		int num = row*row;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i==j) {
					out.print("$ ");
				}else {
					out.print(num*j+" ");
				}
				num--;
			}	
			out.println();
		}
	}
}

//Enter Row Size : 3
//$ 16 21
//6 $ 12
//3 4 $
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign23_Square_pattern$ java Demo
//Enter Row Size : 4
//$ 30 42 52
//12 $ 30 36
//8 14 $ 20
//4 6 6 $
