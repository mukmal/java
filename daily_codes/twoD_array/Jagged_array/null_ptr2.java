class Demo{
	public static void main(String[] args){
		int arr[][]=new int[2][];
		arr[1][2]=50;
	}
}

//Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "<local1>[1]" is null
//        at Demo.main(null_ptr2.java:4)
