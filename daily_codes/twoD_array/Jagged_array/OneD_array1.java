import java.io.*;
class OneD_input{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream out=new PrintStream(System.out);
		out.print("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		out.println("Enter Array Elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		out.println("Elements are : ");
		for(int i=0;i<arr.length;i++){
			out.print(arr[i]+ " ");
		}
		out.println();

	}
}
