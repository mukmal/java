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
		int tempch1=65+row;
		int tempch2=97+row;
		for(int i=1;i<=row;i++){
			int ch1=tempch1-i;
			int ch2=tempch2-i;
			for(int j=i;j<=row;j++){
				if(row%2==0){
					if(i%2==0){
						out.print((char)ch2-- +" ");
					}else{
						out.print((char)ch1-- +" ");
					}
				}else{
					if(i%2==0){
						out.print((char)ch1-- +" ");
					}else{
						out.print((char)ch2-- +" ");
					}					
				}
			}
			out.println();
		}
	}
}

//Enter Row Size : 4
//D C B A
//c b a
//B A
//a
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign13_Triangle_pattern$ java pattern
//Enter Row Size : 3
//c b a
//B A
//a
