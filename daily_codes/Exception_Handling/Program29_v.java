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
			obj.printStackTrace();
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun();
	}	
}
//java.io.IOException: Stream closed
      //  at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:123)
     //   at java.base/java.io.BufferedReader.readLine(BufferedReader.java:321)
    //    at java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
   //     at Demo.fun(Program29_v.java:10)
  //      at Demo.main(Program29_v.java:18)
//null
