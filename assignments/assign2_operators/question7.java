/*write output of below code*/
class c2w{
	public static void main(String[] args){
		int num=100;//in binary 0110 0100
		num--;//99 in binary 0110 0011
		System.out.println(num<<1);// after shifting 11000110 198
		num=num>>>1; //00110001 49
		num+=3;		//52
		System.out.println(num); //52
	}
}
