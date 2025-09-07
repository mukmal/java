import java.io.*;
class FileNotFoundDemo {
	public static void main(String[] args) {
		File obj = new File("a.txt");
		FileReader fr = new FileReader(obj);
	}
}

//error: unreported exception FileNotFoundException; must be caught or declared to be thrown
