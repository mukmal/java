import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		throw new IOException("Stream Closed..");
	}
}
//Exception in thread "main" java.io.IOException: Stream Closed..
//        at Demo.main(Program44.java:4)
