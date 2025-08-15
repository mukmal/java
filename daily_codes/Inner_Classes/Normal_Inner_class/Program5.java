class Parent {
	void fun() {
		System.out.println("In fun-Parent");
	}
	void run() {
		System.out.println("In run-Parent");
	}
}
class Child extends Parent {
	void fun() {
		System.out.println("In fun-Child");
	}
	void run() {
		System.out.println("In run-Child");
	}
	void mun() {
		System.out.println("In mun-Child");
	}
}
class Client {
	public static void main(String[] args) {
		Parent p = new Child();
		p.fun();
		p.run();
		p.mun();
	}
}

//Program5.java:25: error: cannot find symbol
//                p.mun();
//                  ^
//symbol:   method mun()
//location: variable p of type Parent
//1 error
