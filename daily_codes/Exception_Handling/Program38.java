import java.io.*;

class IODemo {
	public static void main(String[] args) {
		throw new IOException("HI");		// unreported exception IOException; must be caught or declared to be thrown
	}
}
