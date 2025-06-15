import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.IOException;

class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Number : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int ch=65+row-i;
			int n=1;
			for(int j=i;j<=row;j++){
				if(i%2==0){
					out.print((char)ch-- +" ");
				}else{
					out.print(n++ +" ");
				}
			}
			out.println();
		}
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign16_mixed_pattern$ java Pattern
//Enter Number : 4
//1 2 3 4
//C B A
//1 2
//A
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign16_mixed_pattern$ java Pattern
//Enter Number : 5
//1 2 3 4 5
//D C B A
//1 2 3
//B A
//1
