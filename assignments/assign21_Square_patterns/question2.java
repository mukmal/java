import java.io.*;
class PatternDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		int r=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(r%3==0){
					System.out.print(r*3+" ");
				}else if(r%5==0){
					System.out.print(r*5+" ");
				}else{
					System.out.print(r+" ");
				}
				r++;
			}
			System.out.println();
		}
	}
}


//Enter Row Size : 3
//9 4 25
//18 7 8
//27 50 11
//Enter Row Size : 4
//4 25 18 7
//8 27 50 11
//36 13 14 45
//16 17 54 19
