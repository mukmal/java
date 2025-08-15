import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int square = num * num;
		int temp = num;
		int count = 0;
		while(temp > 0) {
			count++;
			temp = temp / 10;		
		}
		int divisor = 1;
		for(int i = 1;i<=count;i++) {
			divisor = divisor * 10;
		}
		int lastDigits = square % divisor;
		if (lastDigits == num) {
			System.out.println(num+" is an Automorphic Number");
		} else {
			System.out.println(num+" is not an Automorphic Number");
		}
	}
}

//Enter Number : 25
//25 is an Automorphic Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign29_Number$ java Demo
//Enter Number : 12
//12 is not an Automorphic Number
