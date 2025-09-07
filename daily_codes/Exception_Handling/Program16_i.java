import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class IOExceptionDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String 1 : ");
		String str1 = br.readLine();
		System.out.println(str1);
		System.out.println("Enter String 2 : ");
		br.close();
		String str2 = br.readLine();
		System.out.println(str2);
	}
}

//Enter String 1 :
//Mukesh
//Mukesh
//Enter String 2 :
//Exception in thread "main" java.io.IOException: Stream closed
      //  at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:123)
    //    at java.base/java.io.BufferedReader.readLine(BufferedReader.java:321)
  //      at java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
//        at IOExceptionDemo.main(Program16_i.java:12)
