

class Demo {
	void fun() {
		System.out.println("In fun Demo");
	}
}
class Outer {

	public static void main(String[] args) {
		
		Demo obj = new Demo() {
			
			@Override

			void fun() {
			
			System.out.println("In fun Outer$1");
			};
		};
		obj.fun();
	}
}
//In fun Outer$1
