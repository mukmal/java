class Client {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Runnable ref = ()-> {
		
				System.out.println(Thread.currentThread().getName());
		
		};
		Thread obj = new Thread(ref);
		obj.start();
	}
}

//main
//Thread-0
