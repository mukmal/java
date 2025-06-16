import java.util.*;
class SingleLine{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Player Name : ");
		String info=sc.nextLine();
		StringTokenizer st=new StringTokenizer(info,"@#");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}

//mukesh@DESKTOP-MNCGO64:~/java/daily_codes/String_Tokenizer$ java SingleLine
//Player Name :
//Rohit@Virat@Hardik
//Rohit
//Virat
//Hardik
//mukesh@DESKTOP-MNCGO64:~/java/daily_codes/String_Tokenizer$ java SingleLine
//Player Name :
//Rohit@Virat#Hardik
//Rohit
//Virat
//Hardik
//mukesh@DESKTOP-MNCGO64:~/java/daily_codes/String_Tokenizer$ java SingleLine
//Player Name :
//Rohit,Virat#Hardik
//Rohit,Virat
//Hardik
