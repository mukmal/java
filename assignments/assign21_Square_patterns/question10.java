import java.io.*;
class PatternDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int r=row;
			char ch=(char)('A'+row-1);
			for(int j=1;j<=row;j++){
				if((i*j)%2==1){
					out.print(r+" ");
				}else{
					out.print(ch+" ");
				}
				ch--;
				r--;
			}
			System.out.println();
		}
	}
}

//Enter Row Size : 4
//4 C 2 A
//D C B A
//4 C 2 A
//D C B A
//
//Enter Row Size : 3
//3 B 1
//C B A
//3 B 1
