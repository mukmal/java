import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int sumOfSquare = 0;
		int rem = 0;
		while (num > 0) {
			rem=num%10;
			sumOfSquare += rem*rem;
			num=num/10;
		}
		if(sumOfSquare==1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not Happy Number");
		}
		
	}
}

//Enter Number : 12
//Not Happy Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign29_Number$ java Demo
//Enter Number : 10
//Happy Number
