interface Demo {
	void m1();
	void m2();
}
class DemoChild implements Demo {	
	public void m1() {
	}
	public void m2() {
	}
	void m3() {
	}
}
class Client {
	public static void main(String[] args) {
		Demo obj = new DemoChild();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}

//Program1_iii.java:18: error: cannot find symbol
//                obj.m3();
//                   ^
//symbol:   method m3()
//location: variable obj of type Demo
//1 error
