import java.io.*;
class FileNotFoundDemo {
	public static void main(String[] args) throws FileNotFoundException {
		File obj = new File("a.txt");
		FileReader fr = new FileReader(obj);
		System.out.println(fr.read());		//error: unreported exception IOException; must be caught or declared to be thrown
	}
}


