import java.io.*;
class ExceptionDemo {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age : ");
		int age = 0;
		try {
			age = Integer.parseInt(br.readLine());
		} catch(IOException ie) {
			System.out.println("Connection failed");
		} catch(NumberFormatException nfe) {
			System.out.println("Haglas re Bhava");
		}
		System.out.println("Jaun zop aata");
	}
}
