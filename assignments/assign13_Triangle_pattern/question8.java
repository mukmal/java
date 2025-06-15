import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int temp=row+1-i;
			int ch=65+row-i;
			for(int j=i;j<=row;j++){
				if(i%2!=0){
					out.print(temp-- +" ");
				}else{
					out.print((char)ch-- +" ");
				}
			}
			out.println();
		}
	}
}

//Enter Row Size : 5
//5 4 3 2 1
//D C B A
//3 2 1
//B A
//1
