import java.io.*;
class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintStream out = new PrintStream(System.out);
		out.print("Enter Number : ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int sum = 0;
		int rem = 0;
		while(temp>0) {
			rem = temp % 10;
			int store = 1;
			for(int i=1;i<=rem;i++) {
				store = store*i;	
			}
			sum = sum + store;
			temp = temp / 10;
		}
		if(num == sum) {
			System.out.println(num+" is Strong Number ");
		}else {
			System.out.println(num+" is Not Strong Number ");
		}
	}
}

//Enter Number : 145
//145 is Strong Number
//mukesh@DESKTOP-MNCGO64:~/java/assignments/assign29_Number$ java Demo
//Enter Number : 6
//6 is Not Strong Number
