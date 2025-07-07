
class One {
	int x=10;
	static int y=20;
	void fun() {
		System.out.println("In fun method");
	}
	static void run() {
		System.out.println("In run method");
	}
}

class Two {
	public static void main(String[] args) {
		System.out.println("In main method");
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/daily_codes/classes_objects$ java One
//Error: Main method not found in class One, please define the main method as:
//   public static void main(String[] args)
//   or a JavaFX application class must extend javafx.application.Application
//   mukesh@DESKTOP-MNCGO64:~/java/daily_codes/classes_objects$ java Two
//   In main method
