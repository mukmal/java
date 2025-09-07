import java.io.*;
class Demo {
	void fun() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of x : ");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Enter value of y : ");
		int y = Integer.parseInt(br.readLine());
		System.out.println(x/y);
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun();	// error: unreported exception IOException; must be caught or declared to be thrown
	}
}
