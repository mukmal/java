import java.io.*;
class Demo {
	public static void main(String[] args) {
		try {
			throw new IOException("Stream Closed");			//unreported exception IOException; must be caught or declared to be thrown
		} catch (NullPointerException npe) {
			System.out.println();
		}
	}
}
