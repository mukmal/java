interface Demo {
	void m1(int x,int y);
}
class Outer {
	public static void main(String[] args) {
		Demo obj = (int x,int y)-> {
			System.out.println("Anonymous class");
		};
		obj.m1(10,20);	
	}
}
//Anonymous class
