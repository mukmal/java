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
				if(j%2==1) {
					out.print(num*i+" ");
				}else{
					out.print("@ ");
				}
				num--;
			}	
			out.println();
		}
	}
}

//Enter Row Size : 3
//9 @ 7
//12 @ 8
//9 @ 3
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign23_Square_pattern$ java Demo
//Enter Row Size : 4
//16 @ 14 @
//24 @ 20 @
//24 @ 18 @
//16 @ 8 @
