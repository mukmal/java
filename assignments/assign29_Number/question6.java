import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int first = 0,second = 1;
		int n=0;
		for (int i = 1;i <= num;i++) {
			System.out.println(first+" ");
			int next = first + second ;
			first = second;
			second = next;
		}	
	}
}

//Enter Number : 10
//0
//1
//1
//2
//3
//5
//8
//13
//21
//34
