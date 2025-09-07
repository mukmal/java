import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int y = 0;
		System.out.println("Enter x and y : ");
		try {
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
			System.out.println(x/y);
		} catch(IOException ioe) {
			System.out.println("Connection input");
		} catch(NumberFormatException nfe) {
			System.out.println("Wrong input");
		} catch(ArithmeticException ae) {
			System.out.println("Enter y again : ");
			y = Integer.parseInt(br.readLine());
			System.out.println(x/y);
		} finally {
			System.out.println("Cleanup code");
		}
		System.out.println("End Code");
	}
}

//Enter x and y :
//10
//0
//Enter y again :
//0
//Cleanup code
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at Demo.main(Program32.java:19)
