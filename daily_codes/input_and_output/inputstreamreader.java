import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		int x=isr.read();			//here we take int x because return type of read method is  INTEGER
		System.out.println(x);
	}
}
//if i give input as a string like Mukesh it gives output 77 i.e. ascii value of M
