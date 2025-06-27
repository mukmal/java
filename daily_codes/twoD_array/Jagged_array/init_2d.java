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
	}
}


//Enter size for rows and columns : 3 3
//Insert Data
//1 2 3 4 5 6 7 8 9
//Elements are :
//1 2 3
//4 5 6
//7 8 9
