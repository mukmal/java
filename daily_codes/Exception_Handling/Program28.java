import java.io.*;
class Demo {
	void fun() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
	}
	public static void main(String[] args) throws IOException {
		Demo obj = new Demo();
		obj.fun();
	}
}
