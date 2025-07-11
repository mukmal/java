import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		int num = row;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i%2==1 && j%2==1){
					out.print(num*num-1+" ");
				}else {
					out.print(num*num+" ");
				}
				num++;
			}
			out.println();			
		}
	}
}

//Enter Row Size : 3
//8 16 24
//36 49 64
//80 100 120
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign23_Square_pattern$ java Demo
//Enter Row Size : 4
//15 25 35 49
//64 81 100 121
//143 169 195 225
//256 289 324 361
