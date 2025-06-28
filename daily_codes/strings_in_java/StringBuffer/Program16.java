class Demo{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Shashi");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());
		sb=sb+"Bagal";
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());
	}
}

//Program16.java:7: error: incompatible types: String cannot be converted to StringBuffer
//                sb=sb+"Bagal";
//                                     ^
//                                     1 error
