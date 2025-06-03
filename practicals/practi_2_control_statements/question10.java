class While{
	public static void main(String[] args){
		int num1=10;
		int num2=1;
		while(--num1>num2++){
			System.out.println(num1 + num2);
		}
		System.out.println("value of num1: "+num1);
		System.out.println("value of num2: "+num2);
	}
}
/*
 Iteration	Before   Condition    --num1	num2++	Condition (num1 > num2)	Inside Loop?		num1 + num2     (Printed)After
 	1	num1=10, num2=1		9	1	9 > 1 → ✅ true		Yes			9 + 2 = 11	num1=9, num2=2
 	2	num1=9,  num2=2		8	2	8 > 2 → ✅ true		Yes			8 + 3 = 11	num1=8, num2=3
 	3	num1=8,  num2=3		7	3	7 > 3 → ✅ true		Yes			7 + 4 = 11	num1=7, num2=4
 	4	num1=7,  num2=4		6	4	6 > 4 → ✅ true		Yes			6 + 5 = 11	num1=6, num2=5
 	5	num1=6,  num2=5		5	5	5 > 5 → ❌ false	No			—		num1=5, num2=6
 
 
 
 */
