import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name ");
		String name=br.readLine();
		System.out.println("Enter your society name ");
		String sname=br.readLine();
		System.out.println("Enter your Wing name ");
		char wing=(char)br.read();
		System.out.println("Enter your Flat Number");
		String flatno=br.readLine();		
		System.out.println("Name : "+name);
		System.out.println("Society Name : "+sname);
		System.out.println("Wing : "+wing);
		System.out.println("Flat no: : "+flatno);
	}
}


//Enter your name
//Mukesh
//Enter your society name
//sun
//Enter your Wing name
//A
//Enter your Flat Number
//Name : Mukesh
//Society Name : sun
//Wing : A
//Flat no: :
//
