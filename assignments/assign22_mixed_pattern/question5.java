import java.io.*;
class MixedPattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row = Integer.parseInt(br.readLine());
		int r=3;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(r==14){
					r++;
				}
				if(i%2==1){
					out.print(r*r+" ");
				}else{
					out.print(r+" ");
				}
				r++;
			}
			System.out.println();
		}		
	}
}

//Enter Row Size : 4
//9 16 25 36
//7 8 9 10
//121 144 169 225
//16 17 18 19
