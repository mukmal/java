class OrderDelayedException extends RuntimeException {
	OrderDelayedException(String str) {
		super(str);
	}
}

class Zomato {
	boolean rainStatus = true ;
	boolean rainCheck() {
		if(rainStatus == true)
			return rainStatus;
		else 
			return rainStatus;
	}
	void order(String food) {
		boolean val = rainCheck();
		if(val == true) {
			throw new OrderDelayedException("Order cancelled due to heavy rainfall");
		}
		System.out.println("Preparing order "+food);
	}
}

class Client {
	public static void main(String[] args) {
		Zomato obj = new Zomato();
		obj.order("Biryani");
	}
}

//Exception in thread "main" OrderDelayedException: Order cancelled due to heavy rainfall
//        at Zomato.order(Program1.java:18)
//        at Client.main(Program1.java:27)
