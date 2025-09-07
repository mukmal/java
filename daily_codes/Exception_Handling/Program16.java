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
		String str2 = br.readLine();
		System.out.println(str2);
	}
}
//Enter String 1 :
//Mukesh
//Mukesh
//Enter String 2 :
//Shinde
//Shinde
