import java.io.*;
class PatternDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if((i+j)%2==1){
					out.print(j*3+" ");
				}else{
					out.print(j*2+" ");
				}
			}
			System.out.println();
		}
	}
}

//Enter Row Size : 3
//2 6 6
//3 4 9
//2 6 6
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign21_Square_patterns$ java PatternDemo
//Enter Row Size : 4
//2 6 6 12
//3 4 9 8
//2 6 6 12
//3 4 9 8
