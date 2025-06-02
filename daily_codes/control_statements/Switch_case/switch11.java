class Switch{
	public static void main(String[] args){
		String name="Mukesh";
		System.out.println("before switch");
		switch(name){
			case "Mukesh":
				System.out.println("Mukes");
				break;
			case "Komal":
				System.out.println("Komal");
				break;
			case "Mukmal":
				System.out.println("Mukmal");
				break;
			default://default is much similar to else statement 
				System.out.println("in default state");
		}
		System.out.println("after switch");
	}
}
//before switch 
//Mukes
//after switch
