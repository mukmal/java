class Demo {
	int x = 10;
	Demo (int x) {
		System.out.println(x);
		System.out.println(Demo.this.x);
	}
	class Inner {
		int x = 50;
		Inner (int x) {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Demo.this.x);
		}		
	}
	public static void main (String[] args) {
		Demo obj = new Demo(20);
		Inner obj1 = obj.new Inner(70);		
		//Inner obj1 = new Inner(70);		it will give error because inner class behaves like a normal instance method in that we are
							//trying to access constructor without creating object of outer class 
	}
}

//20
//10
//70
//50
//10
