class While{
	public static void main(String[] args){
		int num=987654321;
		int count=0;
		while(num!=0){
			count++;
			num/=10;
		}
		System.out.println(num);
		System.out.println(count);
	}
}

/*
 Iteration	num before num /= 10	count++	num after num /= 10
 1		987654321		1	98765432
 2		98765432		2	9876543
 3		9876543			3	987654
 4		987654			4	98765
 5		98765			5	9876
 6		9876			6	987
 7		987			7	98
 8		98			8	9
 9		9			9	0
 
 */
