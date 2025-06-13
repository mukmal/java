import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Student name : ");
		String sname=br.readLine();
		System.out.print("Enter clg name : ");
		String cname=br.readLine();
		br.close();
		System.out.print("Enter id : ");
		int cId=Integer.parseInt(br.readLine());
		System.out.println("Student name  "+ sname);
		System.out.println("Clg name : "+cname);
		System.out.println("ID : "+cId);
	}
}
