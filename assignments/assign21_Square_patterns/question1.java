import java.io.*;
class PatternDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			char ch=(char)('A'+(row-1));
			for(int j=1;j<=row;j++){
				if(i%2==1){
					out.print(ch--+" ");
				}else{
					out.print(row+" ");
				}
			}
			out.println();
			
		}
	}
}

//Enter Row Size : 4
//D C B A
//4 4 4 4
//D C B A
//4 4 4 4
