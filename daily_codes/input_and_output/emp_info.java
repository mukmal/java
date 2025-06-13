import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter company name :  ");
		String cname=br.readLine();
		System.out.print("Enter Employee name :   ");
		String ename=br.readLine();
		System.out.print("Enter ID : ");
		int id=Integer.parseInt(br.readLine());
	
		System.out.print("Enter salary : ");
		float sal=Float.parseFloat(br.readLine());
		System.out.println("Company name  : "+cname);
		System.out.println("Employee name  : "+ ename);
		System.out.println("Employee ID  : "+id );
		System.out.println("Salary  : "+sal );
	}
}
