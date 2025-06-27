import java.io.*;
class Pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Row Size : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
			char capitalLetter='A';
			char smallLetter='a';
			for(int j=row;j>i;j--){
				out.print("* ");
			}
			
			for(int k=1;k<=2*i-1;k++){
				if(i%2==1){
					out.print(capitalLetter+" ");
					if(k<i){
						capitalLetter++;
					}else{
						capitalLetter--;		
					}
				}else{
					out.print(smallLetter+" ");
					if(k<i){
						smallLetter++;
					}else{
						smallLetter--;
					}
					
				}
			}

			out.println();
		}
	}
}
/*5
 
 * * * *
 * * *
 * *
 *
 
Enter Row Size : 5
* * * * * A
* * * * A A
* * * A A A
* * A A A A
* A A A A A

Enter Row Size : 5
* * * * * A
* * * * A A A
* * * A A A A A
* * A A A A A A A
* A A A A A A A A A


A
a b a
A B C B A
a b c d c b a
A B C D E D C B A








 */
