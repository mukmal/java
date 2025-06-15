import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter row size : ");
		int row=Integer.parseInt(br.readLine());
		int temp=row+1;
		int temp1=97+row;
		for(int i=1;i<=row;i++){
			int num=temp-i;
			int ch=temp1-i;
			int a=1;
			for(int j=i;j<=row;j++){
				if(a%2==0){
					out.print((char)ch+" ");
					num--;
					ch--;
				}else{
					out.print(num-- +" ");
					ch--;
				}
				a++;
			}
			out.println();
		}
	}
}

//Enter row size : 5
//5 d 3 b 1
//4 c 2 a
//3 b 1
//2 a
//1
