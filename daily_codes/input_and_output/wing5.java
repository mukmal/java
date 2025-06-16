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
		int flatno=Integer.parseInt(br.readLine());		
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
//Exception in thread "main" java.lang.NumberFormatException: For input string: ""
//        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//                at java.base/java.lang.Integer.parseInt(Integer.java:678)
//                        at java.base/java.lang.Integer.parseInt(Integer.java:786)
//                                at Demo.main(wing5.java:12)
