import java.io.PrintStream; // also import java.io.*;
class Demo{
	public static void main(String[] args){
		PrintStream out= new PrintStream(System.out);
		out.println("hello");
	}
}
// output= hello
