import java.io.*;
class FileNotFoundDemo {
	public static void main(String[] args) throws IOException {
		File obj = new File("a.txt");
		FileReader fr = new FileReader(obj);
		System.out.println(fr.read());
	}
}

//no error
