import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row =Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			char ch=(char)('A'+i-1);
			for(int j=1;j<i;j++){
				out.print("  ");
			}
			for(int k=i;k<=row;k++){
				if(row%2==1){
					out.print(ch+" ");
				}else{
					out.print((char)(ch+32)+" ");
				}
				ch++;
			}
			System.out.println();
		}		
	}
}

//Enter Row Size : 4
//a b c d
//  b c d
//    c d
//      d
//
//Enter Row Size : 3
//A B C
//  B C
//    C
