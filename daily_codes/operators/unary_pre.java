class unary{
	public static void main(String[] args){
		int x=10;

	System.out.println(++x);	//11   internally written as x=x+1
	System.out.println(--x);	//10	internally written as x=x-1              (= has lowest priority)
	}
}
/*
int preincrement(x){
	x=x+1;
	return x'
}
int predecrement(x){
	x=x-1;
	return x;
}
*/

	
