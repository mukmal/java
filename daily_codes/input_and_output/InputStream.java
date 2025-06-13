import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new  InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		String name=br.readLine();
		PrintStream obj = new PrintStream(System.out);
		obj.println(name);
	}
}
//input : Mukesh
//Output : Mukesh
//in previous code it will give error because of exception handling 

