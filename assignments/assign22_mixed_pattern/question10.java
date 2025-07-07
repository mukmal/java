import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int num=row;
			for(int s=i;s<row;s++){
				out.print("  ");
				num--;
			}
			for(int j=1;j<=2*i-1;j++){
				out.print(num+" ");
				if(j<i){
					num--;
				}else 
					num++;
			}
			out.println();
		}		
	}
}
//Enter Row Size : 4
//      1
//    2 1 2
//  3 2 1 2 3
//4 3 2 1 2 3 4
