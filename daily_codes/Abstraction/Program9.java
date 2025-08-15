interface Demo {
	void fun();
	void run();
}
class Client {
	public static void main(String[] args) {
		Demo obj = new Demo();	//error: Demo is abstract; cannot be instantiated
	}
}
