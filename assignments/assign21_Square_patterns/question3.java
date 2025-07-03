import java.io.*;
class PatternDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		int r=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==1){
					System.out.print(r*r+" ");
				}else {
					System.out.print(r+" ");
				}
				r++;
			}
			System.out.println();
		}
	}
}


//Enter Row Size : 4
//16 5 6 7
//64 9 10 11
//144 13 14 15
//256 17 18 19
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign21_Square_patterns$ java PatternDemo
//Enter Row Size : 3
//9 4 5
//36 7 8
//81 10 11
