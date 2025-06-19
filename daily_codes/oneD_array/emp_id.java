class Demo{
	public static void main(String[] args){
		int empId=new int[3];
		empId[0]=10;
		empId[1]=20;
		empId[2]=30;
		System.out.println(empId[0]);
		System.out.println(empId[1]);
		System.out.println(empId[2]);
	}
}

//emp_id.java:3: error: incompatible types: int[] cannot be converted to int
//                int empId=new int[3];
//                                          ^
//emp_id.java:4: error: array required, but int found
//                 empId[0]=10;
//                                                                               ^
//emp_id.java:5: error: array required, but int found
//                empId[1]=20;
//                     ^
//emp_id.java:6: error: array required, but int found
//                empId[2]=30;
//                                                                                                                                                         ^
//emp_id.java:7: error: array required, but int found
//                System.out.println(empId[0]);
//                                                                                                                                                                                                                 ^
//emp_id.java:8: error: array required, but int found
//               System.out.println(empId[1]);
//                                     ^
//emp_id.java:9: error: array required, but int found
//               System.out.println(empId[2]);
//                                                                                                                                                                      // 7 errors
