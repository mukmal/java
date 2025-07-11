import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		int num=row;
		int n=1;
		char ch=(char)('a'+row-1);
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(n%2==1){
					out.print(ch+" ");
				}else{
					out.print(num+" ");
				}
				ch++;
				num++;
				n++;
			}		
			out.println();			
		}
	}
}


//or we can also use logic as 
//if((i+j)%2==0)











//Enter Row Size : 4
//d 5 f 7
//h 9 j 11
//l 13 n 15
//p 17 r 19
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign23_Square_pattern$ java Demo
//Enter Row Size : 3
//c 4 e
//6 g 8
//i 10 k
