import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 1 ; i<num ; i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		if(sum<num) {
			System.out.println(num+" is an Abundant Number");
		}else {
			System.out.println(num+" is not an Abundant Number");
		}
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign29_Number$ java Demo
//Enter Number : 25
//25 is an Abundant Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign29_Number$ java Demo
//Enter Number : 12
//12 is not an Abundant Number
