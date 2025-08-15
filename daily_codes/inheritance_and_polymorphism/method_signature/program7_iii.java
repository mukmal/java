class Demo {
	void fun(short a) {
		System.out.println("In fun");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.fun('A');
	}
}

//Java does not allow automatic conversion from char to short because they have different type systems:
//
//Type	Size	Signed/Unsigned	Range
//char	2 bytes	Unsigned	0 to 65535
//short	2 bytes	Signed	-32,768 to 32,767
//
//
//java only allows widening conversions automatically:
//
//char → int ✅ (allowed, because int can hold all char values)
//
//char → short ❌ (disallowed, because some char values exceed short's range)
//
//
//program7_iii.java:7: error: incompatible types: possible lossy conversion from char to short
//                obj.fun('A');
//                         ^
//Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
//1 error
