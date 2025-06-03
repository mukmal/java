class While{
	public static void main(String[] args){
		int number=301071;
		int numval=0;
		int temp=number;
		while(temp!=0){
			numval=numval*10+(temp%10);
			temp/=10;
		}
		System.out.println(temp);
		System.out.println(numval);
		System.out.println(number);
	}
}



/*
numval	temp	numval=numval*10+(temp%10)	temp/=10
0	301071	1				30107
		17				3010
		170				301
		1701				30
		17010				3
		170103				0(Condition false)	
*/

