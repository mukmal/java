class ArrayDemo {
	public static void main(String[] args) {
		int arr[] = new int[] {10,20,30,40,50};
		int i = 0;
		for(;i<=arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("End Main");
	}
}

//10 20 30 40 50 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//        at ArrayDemo.main(Program14_i.java:6)
