class While{
	public static void main(String[] args){
		float num=10;
		char ch=num=10+55;		//incompatible types : possible lossy conversion float to char
		while(num++ >90){
			System.out.println(num);
		}

	}
}


/*
 Now Java sees:

 num = 65 → assigning int (65) to float num is OK ✅ (Java auto-converts int → float)

 But then you're trying:

 java

 char ch = num; // ⚠ float to char ❌
		// This is not allowed in Java directly because:
		//
		// float → char is a narrowing conversion, and
		//
		// Java does not allow narrowing conversions without an explicit cast, because data might be lost (especially fractions).
		//
		//
 
 
 */
