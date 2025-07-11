import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++) {
			int num = row*row;
			for(int j=1;j<=row;j++) {
				if(i%2==1){
					out.print(num-- +" ");
				}else{
					out.print(num+" ");
					if(j%2==1) {
						num = num-5;
					}
				}
			}				
			out.println();	
		}
	}
}

//Enter Row Size : 4
//16 15 14 13
//16 11 11 6
//16 15 14 13
//16 11 11 6
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign23_Square_pattern$ java Demo
//Enter Row Size : 3
//9 8 7
//9 4 4
//9 8 7
