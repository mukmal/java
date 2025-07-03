import java.io.*;
class PatternDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		int n=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(n%2==1){
					out.print(n+" ");
				}else{
					out.print(n*n+" ");
				}
				n++;
			}	
			out.println();
		}
	}
}

//Enter Row Size : 4
//16 5 36 7
//64 9 100 11
//144 13 196 15
//256 17 324 19
