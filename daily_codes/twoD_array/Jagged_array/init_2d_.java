import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size for rows and columns : ");
		int row=sc.nextInt();
		int cols=sc.nextInt();
		int arr[][]=new int[row][cols];
		System.out.println("Insert Data");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements are : ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(arr[1][1]);
		System.out.println(arr[1]);
		System.out.println(arr);
	}
}

//Enter size for rows and columns : 2 2
//Insert Data
//1 2 3 4
//Elements are :
//1 2
//3 4
//4
//[I@1b6d3586
//[[I@4554617c			virtual address
