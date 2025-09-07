import java.util.*;
class Demo {
	static void fun() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Start Fun");
		try {
			System.out.println(x/y);
		} catch(ArithmeticException ae) {
			System.out.println("Enter second value again :");
			y = sc.nextInt();
			try {
				System.out.println(x/y);
			} catch(ArithmeticException er) {
				System.out.println("Ye Vedya");
			}
		}
		System.out.println("End Fun");
	}
	public static void main(String[] args) {
		System.out.println("Start main");
		fun();
		System.out.println("End main");
	}
}
//Start main
//10
//0
//Start Fun
//Enter second value again :
//0
//Ye Vedya
//End Fun
//End main
//mukesh@DESKTOP-MNCGO64:~/java/daily_codes/Exception_Handling$ java Demo
//Start main
//Shashi
//Exception in thread "main" java.util.InputMismatchException
     //   at java.base/java.util.Scanner.throwFor(Scanner.java:939)
    //    at java.base/java.util.Scanner.next(Scanner.java:1594)
   //     at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
  //      at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
 //       at Demo.fun(Program26_i.java:5)
//        at Demo.main(Program26_i.java:23)
