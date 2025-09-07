class Demo extends RuntimeException {
	
}
class Client {
	public static void main(String[] args) {
		throw new Demo();
	}
}
//Exception in thread "main" Demo
//        at Client.main(Program40.java:6)
