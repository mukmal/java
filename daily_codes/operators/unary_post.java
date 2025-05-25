class unary{
	public static void main(String[] args){
		int x=5;
		System.out.println(x++);	//5 the value incremented but due to the post decrement method it return the 5 which is temp value and actual value is6.
		System.out.println(x);		//6
	}
}
/*
int postincrement(x){
	int temp=x;
	x=x+1;
	return temp;
}
int postdecrement(x){
	int temp=x;
	x=x-1;
	return temp;
}
*/
