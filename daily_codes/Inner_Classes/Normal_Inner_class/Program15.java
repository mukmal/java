class Outer {
	class Inner {
		Inner() {
			System.out.println("In Inner Constructor");
		}
	}
}
class Client {
	public static void main(String[] args) {
		Inner obj = new Outer().new Inner(); 	//error :cannot find symbol (Inner)
		//Outer.Inner obj = new Outer().new Inner();
		//new Outer().new Inner();
	}
}


