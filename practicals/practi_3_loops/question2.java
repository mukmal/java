class For{
	public static void main(String[] args){
		int num=23456789;
		for(;num!=0;num/=10){
			int temp=num%10;
			if(temp%2==0){
				System.out.println(temp*temp+" ");
			}
		}
	}
}
/*
 Iteration	num	    temp=num%10	    temp%2==0	Action		Output
 1		23456789	9		No	Skip	
 2		2345678		8		Yes	Print 8×8 = 64	64
 3		234567		7		No	Skip	
 4		23456		6		Yes	Print 6×6 = 36	36
 5		2345		5		No	Skip	
 6		234		4		Yes	Print 4×4 = 16	16
 7		23		3		No	Skip	
 8		2		2		Yes	Print 2×2 = 4	4
 */
