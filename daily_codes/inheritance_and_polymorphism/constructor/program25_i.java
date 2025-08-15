class Demo {
	int x=10;
	int y=20;
	Demo(int x,int y) {
		System.out.println("In constructor");
		System.out.println(x);
		System.out.println(y);
		this.x=x;
		this.y=y;
	}
	void printData() {
		System.out.println(x);
		System.out.println(y);
	}
}
class ConstrDemo {
	public static void main(String[] args) {
		Demo obj= new Demo(30,40);
		obj.printData();
	}
}


//In constructor
//30
//40
//30
//40

