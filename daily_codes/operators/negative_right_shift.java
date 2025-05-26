class bitwise{
	public static void main(String[] args){
		int x=-5;
		System.out.println(x>>2);//-2
	}
}
/*
 to find binary number 
 +5  = 00000000 00000000 00000000 00000101
 Invert         11111111 11111111 11111111 11111010
 Add 1          11111111 11111111 11111111 11111011
 So, -5 = 11111111 11111111 11111111 11111011

Original:      11111111 11111111 11111111 11111011
After >>2:     11111111 11111111 11111111 11111110

This is the binary for -2 in 2's complement.
*/

