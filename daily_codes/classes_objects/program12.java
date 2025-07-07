

class Demo {
	static void run() {
		System.out.println("In Run");
	} 
	public static void main(String[] args) {
		Demo obj = new Demo();
		//First 
		obj.run();
		//second
		run();
		//third 
		Demo.run();
	}
}
