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
	public static void main(String[] args) throws IOException {
		Demo obj = new Demo();
		obj.fun();	
	}
}
//no error
