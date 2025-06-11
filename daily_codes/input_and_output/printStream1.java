import java.io.PrintStream;
class Demo{
	public static void main(String[] args){
		PrintStream obj =new PrintStream(System.out);
		obj.println("Mukesh");
	}
}
//Mukesh
//
//
//do you think why we create an object 
//why could not access directly as PrintStream.println(String);
//because :  non-static method println(String) cannot be referenced from a static context
//System.out.println(String); or above code same              
