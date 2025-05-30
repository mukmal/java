class Switch{
	public static void main(String[] args){
		int num=2;
		System.out.println("before switch");
		switch(num){
			case 1:
				System.out.println("One");
			case 2:
				System.out.println("Two");
			case 3:
				System.out.println("Three");
			default:
				System.out.println("in default state");
		}
		System.out.println("after switch");
	}
}
// before switch
// Two						by default after it finds true case he will execute and also directly execute remianing all without checking condition
// Three
// in default state                        
// after switch
