import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int sum = 0,temp = num;
		for(int i=1;i<temp;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}		
		if(sum > num) {
			System.out.println(num+" is Deficient Number");
		}else {
			System.out.println(num+" is not Deficient Number");
		}
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign29_Number$ java Demo
//Enter Number : 25
//25 is not Deficient Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign29_Number$ java Demo
//Enter Number : 12
//12 is Deficient Number
