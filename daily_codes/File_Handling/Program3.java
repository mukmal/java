import java.io.*;
class FileDemo {
	public static void main(String[] args) throws IOException {
		FileWriter obj = new FileWriter("Incubators.txt",true);
		obj.write("React JS\n");
		obj.write("Flutter\n");
		obj.write("Spring Boot\n");
		obj.close();
	}
}
