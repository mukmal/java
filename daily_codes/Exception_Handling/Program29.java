import java.io.*;
class Demo {
	void fun() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.close();
		String str = null;
		try {
			str = br.readLine();
		} catch(IOException ioe) {
			System.out.println("Connection close aahe");
		}
		System.out.println(str);
	}
	public static void main(String[] args) throws IOException {
		Demo obj = new Demo();
		obj.fun();
	}	
}
//Connection close aahe
//null
