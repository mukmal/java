import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
			if(num==sum) {
				out.println(num+" is perfect Number ");
			}else {
				out.println(num+" is not perfect Number ");
			}
	}
}

//Enter Number : 6
//6 is perfect Number


//Divisor of 6 are 1,2,3 
//1+2+3=6
