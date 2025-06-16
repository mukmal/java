import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name ");
		String name=br.readLine();
		System.out.println("Enter your society name ");
		String sname=br.readLine();
		System.out.println("Enter your Wing name ");
		String wing=br.readLine();
		System.out.println("Enter your Flat Number");
		String flatno=br.readLine();		
	}
}
