import java.io.*;

class Demo{
	public static void main(String[] args){
		InputStreamReader isr=new  InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		String name=br.readLine();
		PrintStream obj = new PrintStream(System.out);
		obj.println(name);
	}
}
// error: unreported exception IOException; must be caught or declared to be thrown
//                 String name=br.readLine();
//                                                        ^
//                                                        1 error
