import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class pattern{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out= new PrintStream(System.out);
		out.print("Enter row size : ");
		int row=Integer.parseInt(br.readLine());
		out.println("Enter two characters ");
		out.print("Enter Character one : ");
		char ch1=br.readLine().charAt(0);
		out.print("Enter Character two : ");
		char ch2=br.readLine().charAt(0);
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					out.print(ch2+" ");
				}else{
					out.print(ch1+" ");
				}
			}
			out.println();
		}
	}
}

//String str = "Hello";
//char ch = str.charAt(0);  // ch = 'H'
//Here, str is a String object.
//
//charAt(0) is a method call that returns the character at index 0 (first character).



//output
//Enter row size : 4
//Enter two characters
//Enter Character one : a
//Enter Character two : $
//a
//$ $
//a a a
//$ $ $ $
