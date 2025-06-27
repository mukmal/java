class Demo{
	public static void main(String[] args){
		int arr1[][]=new int[][]{{10,20,30},{40,50,60}};
		int arr2[][]=new int[][]{{110,120,130},{140,150}};	
		System.out.println(arr2[1][2]);
	}
}


//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//        at Demo.main(arr_2d.java:5)
