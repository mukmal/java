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
		int flatno=br.readLine();		
	}
}

//wing1.java:10: error: incompatible types: String cannot be converted to char
//              char wing=br.readLine();
//		                                     ^
//wing2.java:12: error: incompatible types: String cannot be converted to int
//                int flatno=br.readLine();
//                                                      ^
//                                                      2 errors
