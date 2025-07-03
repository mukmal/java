import java.io.*;
class PatternDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		int r=row;
		char ch='A';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(r%2==1){
					out.print(ch+" ");
				}else{
					out.print(r+" ");
				}
				r++;
			}
			System.out.println();
			ch++;
		}
	}
}

//Enter Row Size : 4
//4 A 6 A
//8 B 10 B
//12 C 14 C
//16 D 18 D
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign21_Square_patterns$ java PatternDemo
//Enter Row Size : 3
//A 4 A
//6 B 8
//C 10 C
