import java.util.*;
class OneDarray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size :");
		int arrSize = sc.nextInt();
		int []arr = new int [arrSize];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
//Enter Array Size :3
//Enter Array Elements :
//12 33 45
//Elements :
//12
//33
//45
