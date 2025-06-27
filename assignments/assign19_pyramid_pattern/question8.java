import java.io.*;
class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		char ch='A';
		for(int i=1;i<row;i++){
			//spacing
			for(int s=i;s<=row-1;s++){
				out.print("  ");
			}
			//print
			for(int j=1;i*2-1>=j;j++){
				if(i%2==0){
					out.print(ch +" ");
				}else{
					out.print(i+" ");
				}
			}
			ch++;
			out.println();
		}
	}
}


//Enter Row Size : 5
//      1
//    B B B
//  3 3 3 3 3
//D D D D D D
