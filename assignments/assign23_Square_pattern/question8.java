import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		int num = row;
		char ch = (char)('a'+row-1);
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i%2==1 && j%2==1) {
					out.print(num*num-1+" ");
				}else{
					out.print(ch+" ");
				}
				ch++;
				num++;
			}
			out.println();
		}
	}
}

//Enter Row Size : 3
//8 d 24
//f g h
//80 j 120
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign23_Square_pattern$ java Demo
//Enter Row Size : 4
//15 e 35 g
//h i j k
//143 m 195 o
//p q r s
