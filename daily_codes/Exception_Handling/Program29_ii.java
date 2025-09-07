import java.io.*;
class Demo {
	void fun() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			br.close();
		} catch(IOException ioe) {}
		try {
			str = br.readLine();
		} catch(IOException obj) {
			System.out.println(obj);
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun();
	}	
}
//java.io.IOException: Stream closed
//null
