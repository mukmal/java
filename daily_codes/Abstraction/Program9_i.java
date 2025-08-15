interface Demo {
	void fun();
	void run();
}
class Child extrends Demo{
}
class Client {
	public static void main(String[] args) {
		Demo obj = new Demo();
	}
}

//Program9_i.java:5: error: '{' expected
//class Child extrends Demo{
//           ^
//           1 error
