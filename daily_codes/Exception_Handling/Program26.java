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
			System.out.println("Wrong input");
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
//Wrong input
//End Fun
//End main
