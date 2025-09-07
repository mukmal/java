import java.io.*;
class Demo {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int y = 0;
		try {
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
			System.out.println(x/y);
			Thread.sleep(2000);
		} catch (NumberFormatException nfe) {
			System.out.println("NFE");
		} catch (InterruptedException ie) {
			System.out.println("IE");
		} catch (IOException ioe) {
			System.out.println("IOE");
		} catch (ArithmeticException ae) {
			System.out.println("AE");
		}
		System.out.println("End Main");			
	}
}

//Mukesh
//NFE
//End Main
//mukesh@DESKTOP-MNCGO64:~/java/daily_codes/Exception_Handling$ java Demo
//10
//0
//AE
//End Main
