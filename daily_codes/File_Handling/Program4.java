import java.io.*;
class FileDemo {
	public static void main(String[] args) throws IOException {
		FileReader obj = new FileReader("Incubators.txt");
		int ch;
		while((ch = obj.read())!=-1) {
			System.out.print((char)ch);
		}
		obj.close();
	}
}
