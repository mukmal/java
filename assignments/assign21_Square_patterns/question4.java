import java.io.*;
class PatternDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		char ch=(char)('A'+row-1);
		int n=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==1){
					out.print(ch++ +" ");
					n++;
				}else{
					out.print(n++ +" ");
					ch++;
				}
			}
			out.println();
		}
	}
}

//Enter Row Size : 4
//D 5 6 7
//H 9 10 11
//L 13 14 15
//P 17 18 19
