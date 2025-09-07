import java.util.Scanner;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		try {
			x = sc.nextInt();
			y = sc.nextInt();
		} catch(Exception e) {
			System.out.println("Input Mismatch");
		} 
		try {
			System.out.println(x/y);
		} catch(Exception e) {
			System.out.println("Zero divisor error");
		}
		System.out.println("End Main");
	}
}

//10
//5
//2
//End Main
//mukesh@DESKTOP-MNCGO64:~/java/daily_codes/Exception_Handling$ java Demo
//10
//0
//Zero divisor error
//End Main
