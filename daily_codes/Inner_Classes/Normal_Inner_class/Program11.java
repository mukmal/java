class Outer {
	class Inner {
		Inner() {
			System.out.println("In Inner-Constructor");
		}
	}
	public static void main(String[] args) {
		Outer obj1 = new Outer();
		Inner obj2 = obj1.new Inner();
		
		//Inner obj = new Outer().new Inner();
	}
}
//In Inner-Constructor
