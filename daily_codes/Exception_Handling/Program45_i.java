import java.io.*;
class Demo {
	public static void main(String[] args) {
		try {
			throw new IOException("Stream Closed");			
		} catch (Exception npe) {
			System.out.println("hi");
		}
	}
}
//hi
