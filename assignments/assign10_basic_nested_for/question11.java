class For{
	public static void main(String[] args){
		int num=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(num++ +"  ");	
			}
			int temp=num-3;
			num=temp;
			System.out.println();
		}
	}
}
//1  2  3  4
//2  3  4  5
//3  4  5  6
//4  5  6  7



/*
 Step-by-step Explanation:
Initial: num = 1

Outer Loop i = 1:
j=1 → print 1, num becomes 2

j=2 → print 2, num becomes 3

j=3 → print 3, num becomes 4

j=4 → print 4, num becomes 5
After inner loop:

temp = num - 3 = 5 - 3 = 2, so num = 2

Printed line: 1 2 3 4

Outer Loop i = 2:
j=1 → print 2, num becomes 3

j=2 → print 3, num becomes 4

j=3 → print 4, num becomes 5

j=4 → print 5, num becomes 6
After inner loop:

temp = 6 - 3 = 3, so num = 3

Printed line: 2 3 4 5

Outer Loop i = 3:
j=1 → print 3, num becomes 4

j=2 → print 4, num becomes 5

j=3 → print 5, num becomes 6

j=4 → print 6, num becomes 7
After inner loop:

temp = 7 - 3 = 4, so num = 4

Printed line: 3 4 5 6

Outer Loop i = 4:
j=1 → print 4, num becomes 5

j=2 → print 5, num becomes 6

j=3 → print 6, num becomes 7

j=4 → print 7, num becomes 8
After inner loop:

temp = 8 - 3 = 5, so num = 5

Printed line: 4 5 6 7


 
 */
