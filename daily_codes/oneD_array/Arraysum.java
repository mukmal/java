import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter Array Element : ");
			arr[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("Array Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			sum=sum+arr[i];
		}
		System.out.println("Sum : "+sum);

	}
}

//Enter Array Size : 4
//Enter Array Element : 10
//Enter Array Element : 20
//Enter Array Element : 30
//Enter Array Element : 40
//Array Elements :
//10
//20
//30
//40
//Sum : 100
