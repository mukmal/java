import java.io.*;
class FileNotFoundDemo {
	public static void main(String[] args) throws IOException {
		File obj = new File("a.txt");
		FileReader fr = new FileReader(obj);
		int ch;
		while ((ch=fr.read())!=-1) {
			System.out.print((char)ch);
			System.out.println();
		}
	}
}
//Exception in thread "main" java.io.FileNotFoundException: a.txt (No such file or directory)
//runtime exception
