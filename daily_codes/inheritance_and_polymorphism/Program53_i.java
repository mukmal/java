
class Demo {
	int x=10;
	Demo(Demo this) { 
		System.out.println("In no-args Constructor");
	}
	Demo(Demo this,int x) {
		System.out.println("In parametarized Constructor");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		Demo obj1 = new Demo(10);
	}
}

//Program53_i.java:4: error: receiver parameter not applicable for constructor of top-level class
//        Demo(Demo this) {
//             ^
//Program53_i.java:7: error: receiver parameter not applicable for constructor of top-level class
//        Demo(Demo this,int x) {
//             ^
//2 errors
