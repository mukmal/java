class Demo{
	public static void main(String[] args){
		int arr1[][]=new int[0][0];//Allowed
		int arr1[][]=new int[3][0];//Allowed
		int arr1[][]=new int[][3];//Not allowed
		int arr1[][]=new int[][];//Not allowed
		int arr1[][]=new int[3][]; //Allowed
		int arr1[][]={10,20,30,40};//error : incompatible types int cannot be converted to int[]    4times error
		int arr1[][]={{10,20},{30,40}}; //create 2by 2 array Allowed
	}
}
