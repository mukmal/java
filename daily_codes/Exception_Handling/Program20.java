import java.util.Scanner;
class ArithmeticDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value : ");
		int x = sc.nextInt();
		System.out.println("Enter value : ");
		int y = sc.nextInt();
		System.out.println(x/y);
	}
}
//Enter value :
//1
//Enter value :
//0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
  //      at ArithmeticDemo.main(Program20.java:9)
//mukesh@DESKTOP-MNCGO64:~/java/daily_codes/Exception_Handling$ java ArithmeticDemo
//Enter value :
//Mukesh
//Exception in thread "main" java.util.InputMismatchException
        //at java.base/java.util.Scanner.throwFor(Scanner.java:939)
      //  at java.base/java.util.Scanner.next(Scanner.java:1594)
    //    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
  //      at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//        at ArithmeticDemo.main(Program20.java:6)
