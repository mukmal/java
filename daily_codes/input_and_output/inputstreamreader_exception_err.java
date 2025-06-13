import java.io.InputStreamReader;
class Demo{
	public static void main(String[] args){
		InputStreamReader isr=new InputStreamReader(System.in);
		int x=isr.read();
		System.out.println(x);
	}
}
