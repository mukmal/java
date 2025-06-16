import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name ");
		String name=br.readLine();
		System.out.println("Enter your society name ");
		String sname=br.readLine();
		System.out.println("Enter your Wing name ");
		char wing=br.readLine();
		System.out.println("Enter your Flat Number");
		String flatno=br.readLine();		
	}
}

//wing1.java:10: error: incompatible types: String cannot be converted to char
//              char wing=br.readLine();
//		                                     ^
//						     1 error
