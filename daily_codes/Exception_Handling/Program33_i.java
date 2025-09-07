class Demo {
	public static void main(String[] args) {
		System.out.println("Start Code");
		try {								//error: 'try' without 'catch', 'finally' or resource declarations
			System.out.println(10/0);
		} 
		System.out.println("End Code");
	}
}
