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
				if(r%2==1){
					out.print(r*r+" ");
				}else{
					out.print(r+" ");
				}
				r++;
			}
			System.out.println();
		}
	}
}

//Enter Row Size : 3
//9 4 25
//6 49 8
//81 10 121
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign21_Square_patterns$ java PatternDemo
//Enter Row Size : 4
//4 25 6 49
//8 81 10 121
//12 169 14 225
//16 289 18 361
