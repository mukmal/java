import java.io.*;
class UserInput {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println(name[3]);
	}
}
//Program13_i.java:6: error: array required, but String found
//                System.out.println(name[3]);
//                                       ^
//1 error






//In Java, a String is not an array.

//It is a class (java.lang.String) that internally uses a char[] array to store characters.

//But Java does not expose that internal array directly.

//That means you cannot use name[3] like you would with an array.

//name[3] is only valid if name was actually a char[].
