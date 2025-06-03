class While{
	public static void main(String[] args){
		while(true){
		
		}
		System.out.println();
	}
}
/*
error: unreachable statement
                System.out.println();
		                ^ 
 */
/*
 In Java, code that will never be executed is called an "unreachable statement." The Java compiler is smart enough to detect these cases.

 Let’s understand what's happening here:

 while(true) is an infinite loop:
 It never ends, because the condition true is always true.

 So, the code inside the loop runs forever.

 The code after the loop (like System.out.println();) can never be reached — and the compiler knows that. 
 */
