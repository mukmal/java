import java.io.*;
class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=row;i++){
			for(int s=row;s>i;s--){
				out.print("  ");
			}
			char ch=(char)('A'+row-i);
			for(int j=1;j<=2*i-1;j++){
				out.print(ch+" ");
				if(j<i){
					ch++;
				}else{
					ch--;
				}
			}
			out.println();
		}	
		}
	
}

//Enter Row Size : 4
//      D
//    C D C
//  B C D C B
//A B C D C B A
