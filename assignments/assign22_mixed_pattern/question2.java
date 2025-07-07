import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row =Integer.parseInt(br.readLine());
		int num=2;
		for(int i=1;i<=row;i++){
			//spacing 
			for(int j=1;j<i;j++){
				out.print("  ");
			}
			num--;
			for(int k=i;k<=row;k++){
				out.print(num+++" ");
			}
				
			out.println();
		}		
	}
}

//Enter Row Size : 4
//1 2 3 4
//  4 5 6
//    6 7
//      7
