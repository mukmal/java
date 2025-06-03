class For{
	public static void main(String[] args){
		int num=0;
		for(int i=num;i<=128;i++){
			char ch=0; 	//This sets ch to the character with ASCII value 0 (NULL character).
			System.out.println(num + " = "+ch );	//ch is the null character ('\0'), which is invisible. output 0=    (129 times)
			ch+=i;	//ch updating but due to line 5 it will reset to NULL
		}
	}
}
