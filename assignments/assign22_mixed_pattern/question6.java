import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			int num=1;
			for(int s=i;s<row;s++) {
				out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print(num+" ");
				if(j<i){
					num++;
				}else{
					num--;
				}
			}
			System.out.println();
		}
		
	}
}

//Enter Row Size : 4
//      1
//    1 2 1
//  1 2 3 2 1
//1 2 3 4 3 2 1
